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
                            2: View project
                            3: Exit
                            """
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
                        company.project.printProjectInfo();
                    }
                }
                case 2 -> {
                    if (company.project == null) {
                        System.out.println("There is no project");
                        break;
                    }
                    projectMenu(company.project);
                }
            }
        } while (input != 3);
    }

    static void projectMenu(Project project) {
        int input;
        do {
            System.out.println(
                    """
                            0: View Project info
                            1: Add project milestone
                            2: Add project task
                            3: Complete task
                            4: Exit
                            """
            );
            input = scanner.nextInt();
            switch (input) {
                case 0 -> project.printProjectInfo();
                case 1 -> {
                    System.out.println("Enter the milestone's name");
                    String temp = scanner.next();
                    project.milestones.add(new Milestone(temp));
                }
                case 2 -> {
                    //TODO add the task adding system; Look at line 157 for reference
                }
            }
        } while (input != 5);
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

    void printProjectInfo()
    {
        System.out.println("Project info:\n" +
                "Name : " + name + "\n" +
                "Employees assigned : " + employees.size()
        );
        printEmployees();
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
    public Milestone(String name) {
        this.name = name;
    }

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
        } catch (NullPointerException ignored) {
        }
        System.out.println("Enter the project name");
        String tempName = Main.scanner.next();
        ArrayList<Employee> tempEmployeeList = new ArrayList<>();
        //TODO maybe print all the employees with their corresponding index first?
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