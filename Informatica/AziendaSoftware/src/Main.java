import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Company company = new Company();

    public static void main(String[] args) {
        int input;
        do {
            System.out.println(
                    """
                            0: Add employee
                            1: Add project
                            2: View project"""
            );
            input = scanner.nextInt();

            switch (input) {
                case 0 -> {
                    System.out.println("Enter the employee's name");
                    String tempName = scanner.next();
                    System.out.println("Enter the employee's surname");
                    String tempSurname = scanner.next();
                    company.addEmployee(tempName, tempSurname);
                }
                case 1 -> {
                    int temp = company.addProject();
                    if (temp == -1) {
                        System.out.println("There is already a project");
                    } else {
                        System.out.println("Project created\n" +
                                "Name : " + company.project.name + "\n" +
                                "Employees assigned : " + company.project.employees.size()
                        );
                        company.project.printEmployees();
                    }
                }
                case 2 -> {
                    try {
                        if (company.project == null) {
                            System.out.println("There is no project");
                        }
                    } catch (java.lang.NullPointerException ignored) {
                    }
                }
            }
        } while (input != -1);
    }
}

class Project {
    String name;
    ArrayList<Milestone> milestones;
    ArrayList<Employee> employees;
    boolean isComplete = false;
    float percentage = 0.0f;

    public Project(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.surname);
        }
    }
}

class Employee {
    String name;
    String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class Milestone {
    String name;
    float percentage = 0.0f;
    ArrayList<Task> tasks;
    boolean isComplete = false;
}

class Task {
    String name;
    Date deadline;
    boolean isCritical = false;
    boolean isComplete = false;
    Employee assignedEmployee;
}

class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    Project project;

    void addEmployee(String name, String surname) {
        employees.add(
                new Employee(
                        name,
                        surname
                )
        );
    }

    int addProject() {
        try {
            if (!this.project.isComplete) {
                return -1;
            }
        } catch (java.lang.NullPointerException ignored) {
        }
        System.out.println("Enter the project name");
        String tempName = Main.scanner.next();
        ArrayList<Employee> tempEmployeeList = new ArrayList<>();
        System.out.println("Enter employees by index who will work on this project\n" +
                "Enter -1 to exit");
        int temp;
        do {
            temp = Main.scanner.nextInt();
            if (temp != -1) {
                tempEmployeeList.add(this.employees.get(temp));
            }
        } while (temp != -1);
        project = new Project(tempName, tempEmployeeList);
        return 0;
    }
}