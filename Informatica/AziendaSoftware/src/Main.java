import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Company company = new Company();

    //when the programming is object oriented
    /*
        ⠀⠀⠀⡯⡯⡾⠝⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢊⠘⡮⣣⠪⠢⡑⡌
        ⠀⠀⠀⠟⠝⠈⠀⠀⠀⠡⠀⠠⢈⠠⢐⢠⢂⢔⣐⢄⡂⢔⠀⡁⢉⠸⢨⢑⠕⡌
        ⠀⠀⡀⠁⠀⠀⠀⡀⢂⠡⠈⡔⣕⢮⣳⢯⣿⣻⣟⣯⣯⢷⣫⣆⡂⠀⠀⢐⠑⡌
        ⢀⠠⠐⠈⠀⢀⢂⠢⡂⠕⡁⣝⢮⣳⢽⡽⣾⣻⣿⣯⡯⣟⣞⢾⢜⢆⠀⡀⠀⠪
        ⣬⠂⠀⠀⢀⢂⢪⠨⢂⠥⣺⡪⣗⢗⣽⢽⡯⣿⣽⣷⢿⡽⡾⡽⣝⢎⠀⠀⠀⢡
        ⣿⠀⠀⠀⢂⠢⢂⢥⢱⡹⣪⢞⡵⣻⡪⡯⡯⣟⡾⣿⣻⡽⣯⡻⣪⠧⠑⠀⠁⢐
        ⣿⠀⠀⠀⠢⢑⠠⠑⠕⡝⡎⡗⡝⡎⣞⢽⡹⣕⢯⢻⠹⡹⢚⠝⡷⡽⡨⠀⠀⢔
        ⣿⡯⠀⢈⠈⢄⠂⠂⠐⠀⠌⠠⢑⠱⡱⡱⡑⢔⠁⠀⡀⠐⠐⠐⡡⡹⣪⠀⠀⢘
        ⣿⣽⠀⡀⡊⠀⠐⠨⠈⡁⠂⢈⠠⡱⡽⣷⡑⠁⠠⠑⠀⢉⢇⣤⢘⣪⢽⠀⢌⢎
        ⣿⢾⠀⢌⠌⠀⡁⠢⠂⠐⡀⠀⢀⢳⢽⣽⡺⣨⢄⣑⢉⢃⢭⡲⣕⡭⣹⠠⢐⢗
        ⣿⡗⠀⠢⠡⡱⡸⣔⢵⢱⢸⠈⠀⡪⣳⣳⢹⢜⡵⣱⢱⡱⣳⡹⣵⣻⢔⢅⢬⡷
        ⣷⡇⡂⠡⡑⢕⢕⠕⡑⠡⢂⢊⢐⢕⡝⡮⡧⡳⣝⢴⡐⣁⠃⡫⡒⣕⢏⡮⣷⡟
        ⣷⣻⣅⠑⢌⠢⠁⢐⠠⠑⡐⠐⠌⡪⠮⡫⠪⡪⡪⣺⢸⠰⠡⠠⠐⢱⠨⡪⡪⡰
        ⣯⢷⣟⣇⡂⡂⡌⡀⠀⠁⡂⠅⠂⠀⡑⡄⢇⠇⢝⡨⡠⡁⢐⠠⢀⢪⡐⡜⡪⡊
        ⣿⢽⡾⢹⡄⠕⡅⢇⠂⠑⣴⡬⣬⣬⣆⢮⣦⣷⣵⣷⡗⢃⢮⠱⡸⢰⢱⢸⢨⢌
        ⣯⢯⣟⠸⣳⡅⠜⠔⡌⡐⠈⠻⠟⣿⢿⣿⣿⠿⡻⣃⠢⣱⡳⡱⡩⢢⠣⡃⠢⠁
        ⡯⣟⣞⡇⡿⣽⡪⡘⡰⠨⢐⢀⠢⢢⢄⢤⣰⠼⡾⢕⢕⡵⣝⠎⢌⢪⠪⡘⡌⠀
        ⡯⣳⠯⠚⢊⠡⡂⢂⠨⠊⠔⡑⠬⡸⣘⢬⢪⣪⡺⡼⣕⢯⢞⢕⢝⠎⢻⢼⣀⠀
        ⠁⡂⠔⡁⡢⠣⢀⠢⠀⠅⠱⡐⡱⡘⡔⡕⡕⣲⡹⣎⡮⡏⡑⢜⢼⡱⢩⣗⣯⣟
        ⢀⢂⢑⠀⡂⡃⠅⠊⢄⢑⠠⠑⢕⢕⢝⢮⢺⢕⢟⢮⢊⢢⢱⢄⠃⣇⣞⢞⣞⢾
        ⢀⠢⡑⡀⢂⢊⠠⠁⡂⡐⠀⠅⡈⠪⠪⠪⠣⠫⠑⡁⢔⠕⣜⣜⢦⡰⡎⡯⡾⡽
     */
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
                            4: Advance day
                            5: Exit
                            """
            );
            input = scanner.nextInt();
            switch (input) {
                //TODO add more stuff to project info like percentage (still need to do that btw), print critical tasks when and if I get around to doing that
                case 0 -> {
                    project.printProjectInfo();
                }
                case 1 -> {
                    System.out.println("Enter the milestone's name");
                    String temp = scanner.next();
                    project.addMilestone(temp);
                }
                case 2 -> {
                    System.out.println("Enter the milestone by index");
                    for (int i = 0; i < project.milestones.size(); i++) {
                        System.out.println(i + ": " + project.milestones.get(i).name);
                    }
                    int temp = scanner.nextInt();
                    Milestone tempMilestone = project.milestones.get(temp);

                    System.out.println("Chosen " + tempMilestone.name);

                    System.out.println("Enter the task's assigned employee by index");
                    /*
                    ———————No interpolated strings?————————
                    ⠀⣞⢽⢪⢣⢣⢣⢫⡺⡵⣝⡮⣗⢷⢽⢽⢽⣮⡷⡽⣜⣜⢮⢺⣜⢷⢽⢝⡽⣝
                    ⠸⡸⠜⠕⠕⠁⢁⢇⢏⢽⢺⣪⡳⡝⣎⣏⢯⢞⡿⣟⣷⣳⢯⡷⣽⢽⢯⣳⣫⠇
                    ⠀⠀⢀⢀⢄⢬⢪⡪⡎⣆⡈⠚⠜⠕⠇⠗⠝⢕⢯⢫⣞⣯⣿⣻⡽⣏⢗⣗⠏⠀
                    ⠀⠪⡪⡪⣪⢪⢺⢸⢢⢓⢆⢤⢀⠀⠀⠀⠀⠈⢊⢞⡾⣿⡯⣏⢮⠷⠁⠀⠀
                    ⠀⠀⠀⠈⠊⠆⡃⠕⢕⢇⢇⢇⢇⢇⢏⢎⢎⢆⢄⠀⢑⣽⣿⢝⠲⠉⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⡿⠂⠠⠀⡇⢇⠕⢈⣀⠀⠁⠡⠣⡣⡫⣂⣿⠯⢪⠰⠂⠀⠀⠀⠀
                    ⠀⠀⠀⠀⡦⡙⡂⢀⢤⢣⠣⡈⣾⡃⠠⠄⠀⡄⢱⣌⣶⢏⢊⠂⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⢝⡲⣜⡮⡏⢎⢌⢂⠙⠢⠐⢀⢘⢵⣽⣿⡿⠁⠁⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠨⣺⡺⡕⡕⡱⡑⡆⡕⡅⡕⡜⡼⢽⡻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⣼⣳⣫⣾⣵⣗⡵⡱⡡⢣⢑⢕⢜⢕⡝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⣴⣿⣾⣿⣿⣿⡿⡽⡑⢌⠪⡢⡣⣣⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⡟⡾⣿⢿⢿⢵⣽⣾⣼⣘⢸⢸⣞⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠁⠇⠡⠩⡫⢿⣝⡻⡮⣒⢽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    —————————————————————————————
            */
                    for (int i = 0; i < project.employees.size(); i++) {
                        System.out.println(i + ": " + project.employees.get(i).name + " " + project.employees.get(i).surname);
                    }
                    Employee tempEmployee = project.employees.get(scanner.nextInt());

                    if (checkEmployee(project, tempEmployee) == -1) {
                        System.out.println("Employee assigned to another task");
                        break;
                    }

                    System.out.println("Enter the task's name");
                    String tempName = scanner.next();

                    System.out.println("Enter the task's deadline in days");
                    int tempDeadLine = scanner.nextInt();

                    tempMilestone.addTask(
                            tempName,
                            tempDeadLine,
                            tempEmployee
                    );
                }
                case 3 -> {
                    System.out.println("Enter the milestone by index");
                    for (int i = 0; i < project.milestones.size(); i++) {
                        System.out.println(i + ": " + project.milestones.get(i).name);
                    }
                    int temp = scanner.nextInt();
                    Milestone tempMilestone = project.milestones.get(temp);

                    System.out.println("Chosen " + tempMilestone.name);

                    System.out.println("Enter the task by index");
                    /*
                    ———————No interpolated strings?————————
                    ⠀⣞⢽⢪⢣⢣⢣⢫⡺⡵⣝⡮⣗⢷⢽⢽⢽⣮⡷⡽⣜⣜⢮⢺⣜⢷⢽⢝⡽⣝
                    ⠸⡸⠜⠕⠕⠁⢁⢇⢏⢽⢺⣪⡳⡝⣎⣏⢯⢞⡿⣟⣷⣳⢯⡷⣽⢽⢯⣳⣫⠇
                    ⠀⠀⢀⢀⢄⢬⢪⡪⡎⣆⡈⠚⠜⠕⠇⠗⠝⢕⢯⢫⣞⣯⣿⣻⡽⣏⢗⣗⠏⠀
                    ⠀⠪⡪⡪⣪⢪⢺⢸⢢⢓⢆⢤⢀⠀⠀⠀⠀⠈⢊⢞⡾⣿⡯⣏⢮⠷⠁⠀⠀
                    ⠀⠀⠀⠈⠊⠆⡃⠕⢕⢇⢇⢇⢇⢇⢏⢎⢎⢆⢄⠀⢑⣽⣿⢝⠲⠉⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⡿⠂⠠⠀⡇⢇⠕⢈⣀⠀⠁⠡⠣⡣⡫⣂⣿⠯⢪⠰⠂⠀⠀⠀⠀
                    ⠀⠀⠀⠀⡦⡙⡂⢀⢤⢣⠣⡈⣾⡃⠠⠄⠀⡄⢱⣌⣶⢏⢊⠂⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⢝⡲⣜⡮⡏⢎⢌⢂⠙⠢⠐⢀⢘⢵⣽⣿⡿⠁⠁⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠨⣺⡺⡕⡕⡱⡑⡆⡕⡅⡕⡜⡼⢽⡻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⣼⣳⣫⣾⣵⣗⡵⡱⡡⢣⢑⢕⢜⢕⡝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⣴⣿⣾⣿⣿⣿⡿⡽⡑⢌⠪⡢⡣⣣⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⡟⡾⣿⢿⢿⢵⣽⣾⣼⣘⢸⢸⣞⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠁⠇⠡⠩⡫⢿⣝⡻⡮⣒⢽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    —————————————————————————————
            */
                    for (int i = 0; i < tempMilestone.tasks.size(); i++) {
                        System.out.println(i + ": " + tempMilestone.tasks.get(i).name);
                    }
                    temp = scanner.nextInt();

                    Task tempTask = tempMilestone.tasks.get(temp);
                    System.out.println("Chosen " + tempTask.name);
                    tempTask.isComplete = true;
                }
                case 4 -> {
                    project.day++;
                    //TODO print critical tasks maybe
                }
            }
        } while (input != 5);
    }

    static int checkEmployee(Project project, Employee employee) {
        //should work, who fucking knows, maybe check on it with the debugger ASAP
        ArrayList<Milestone> milestones = project.milestones;
        for (Milestone milestone : milestones) {
            for (Task task : milestone.tasks) {
                if (task.assignedEmployee == employee)
                    return -1;
            }
        }
        return 0;
    }

}

class Project {
    String name;
    ArrayList<Milestone> milestones = new ArrayList<>();
    ArrayList<Employee> employees;
    boolean isComplete = false;
    float percentage = 0.0f;

    int day = 0;

    public Project(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    //whyyyyy
    void addMilestone(String name) {
        milestones.add(new Milestone(name));
    }

    void printProjectInfo() {
        System.out.println("Project info:\n" +
                "Name : " + name + "\n" +
                "Employees assigned : " + employees.size() + "\n"
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
    String name;
    float percentage = 0.0f;
    ArrayList<Task> tasks = new ArrayList<>();
    boolean isComplete = false;

    public Milestone(String name) {
        this.name = name;
    }

    //why
    void addTask(String name, int deadline, Employee assignedEmployee) {
        tasks.add(new Task(name, deadline, assignedEmployee));
    }
}

class Task {
    String name;
    int deadline;

    //just check the current day with the deadline
    boolean isCritical = false;
    boolean isComplete = false;
    Employee assignedEmployee;

    public Task(String name, int deadline, Employee assignedEmployee) {
        this.name = name;
        this.deadline = deadline;
        this.assignedEmployee = assignedEmployee;
    }
}

class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    Project project;

    //why did I do this again?
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
        System.out.println("Enter employees by index who will work on this project\n" +
                "Enter -1 to exit");
        /*
                    ———————No interpolated strings?————————
                    ⠀⣞⢽⢪⢣⢣⢣⢫⡺⡵⣝⡮⣗⢷⢽⢽⢽⣮⡷⡽⣜⣜⢮⢺⣜⢷⢽⢝⡽⣝
                    ⠸⡸⠜⠕⠕⠁⢁⢇⢏⢽⢺⣪⡳⡝⣎⣏⢯⢞⡿⣟⣷⣳⢯⡷⣽⢽⢯⣳⣫⠇
                    ⠀⠀⢀⢀⢄⢬⢪⡪⡎⣆⡈⠚⠜⠕⠇⠗⠝⢕⢯⢫⣞⣯⣿⣻⡽⣏⢗⣗⠏⠀
                    ⠀⠪⡪⡪⣪⢪⢺⢸⢢⢓⢆⢤⢀⠀⠀⠀⠀⠈⢊⢞⡾⣿⡯⣏⢮⠷⠁⠀⠀
                    ⠀⠀⠀⠈⠊⠆⡃⠕⢕⢇⢇⢇⢇⢇⢏⢎⢎⢆⢄⠀⢑⣽⣿⢝⠲⠉⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⡿⠂⠠⠀⡇⢇⠕⢈⣀⠀⠁⠡⠣⡣⡫⣂⣿⠯⢪⠰⠂⠀⠀⠀⠀
                    ⠀⠀⠀⠀⡦⡙⡂⢀⢤⢣⠣⡈⣾⡃⠠⠄⠀⡄⢱⣌⣶⢏⢊⠂⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⢝⡲⣜⡮⡏⢎⢌⢂⠙⠢⠐⢀⢘⢵⣽⣿⡿⠁⠁⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠨⣺⡺⡕⡕⡱⡑⡆⡕⡅⡕⡜⡼⢽⡻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⣼⣳⣫⣾⣵⣗⡵⡱⡡⢣⢑⢕⢜⢕⡝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⣴⣿⣾⣿⣿⣿⡿⡽⡑⢌⠪⡢⡣⣣⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⡟⡾⣿⢿⢿⢵⣽⣾⣼⣘⢸⢸⣞⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠁⠇⠡⠩⡫⢿⣝⡻⡮⣒⢽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    —————————————————————————————
            */
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i + ": " + employees.get(i).name + " " + employees.get(i).surname);
        }
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