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
        ⣯⢷⣟⣇⡂⡂⡌⡀⠀⠁⡂⠅⠂⠀⡑⡄⢇⠇⢝⡨⡠⡁⢐⠠⢀⢪⡐⡜⡪⡊0
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
                case 0 -> {
                    project.checkCriticalTasks();
                    project.printProjectInfo();
                }
                case 1 -> {
                    System.out.println("Enter the milestone's name");
                    String temp = scanner.next();
                    project.addMilestone(temp);
                }
                case 2 -> {
                    if (project.milestones.size() > 0) {
                        Milestone tempMilestone = project.getMilestone();

                        System.out.println("Enter the task's assigned employee by index");
                        for (int i = 0; i < project.employees.size(); i++) {
                            System.out.println(i + ": " + project.employees.get(i).name + " " + project.employees.get(i).surname);
                        }
                        Employee tempEmployee = project.employees.get(scanner.nextInt());

                        if (project.checkEmployee(tempEmployee) == -1) {
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
                    } else {
                        System.out.println("No milestones");
                    }
                }
                case 3 -> {
                    if (project.milestones.size() > 0) {
                        Milestone tempMilestone = project.getMilestone();
                        int temp;

                        System.out.println("Enter the task by index");
                        for (int i = 0; i < tempMilestone.tasks.size(); i++) {
                            System.out.println(i + ": " + tempMilestone.tasks.get(i).name);
                        }
                        temp = scanner.nextInt();

                        Task tempTask = tempMilestone.tasks.get(temp);
                        System.out.println("Chosen " + tempTask.name);
                        tempTask.isComplete = true;
                        project.checkComplete();
                    } else {
                        System.out.println("No milestones");
                    }
                }
                case 4 -> {
                    project.projectDay++;
                    System.out.println("The day is " + project.projectDay);
                    project.checkCriticalTasks();
                    System.out.println("Critical tasks");
                    for (Task task : project.getCriticalTasks()) {
                        System.out.println(task.name + " Due to:" + task.deadline + "Assigned to " + task.name);
                    }
                }
            }
        } while (input != 5);
    }
}

class Project {
    String name;
    ArrayList<Milestone> milestones = new ArrayList<>();
    ArrayList<Employee> employees;
    boolean isComplete = false;
    float percentage = 0.0f;

    int projectDay = 0;

    public Project(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    void addMilestone(String name) {
        milestones.add(new Milestone(name));
    }

    void printProjectInfo() {
        System.out.println("Project info:\n" +
                "Name : " + name + "\n" +
                "Percentage" + percentage + "\n" +
                "Employees assigned : " + employees.size() + "\n"
        );
        printEmployees();
        calcPerc();

        System.out.println("Milestones");
        for (Milestone milestone : milestones) {
            milestone.checkComplete();
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
            System.out.println("Milestone: " + milestone.name + ", Percentage:" + milestone.percentage + ", " + (milestone.isComplete ? "Completed" : "Not completed"));
            for (Task task : milestone.tasks) {
                System.out.println("Task " + task.name + ", Deadline:" + task.deadline + ", Employee assigned" + task.assignedEmployee.name + " " + task.assignedEmployee.surname + ", " + (task.isComplete ? "Completed" : "Not completed") + ", " + (task.isCritical ? "Critical" : "Not critical"));
            }
        }
        System.out.println();
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.surname);
        }
    }

    int checkEmployee(Employee employee) {
        for (Milestone milestone : milestones) {
            for (Task task : milestone.tasks) {
                if (task.assignedEmployee == employee && !task.isComplete)
                    return -1;
            }
        }
        return 0;
    }

    ArrayList<Task> getCriticalTasks() {
        ArrayList<Task> taskArrayList = new ArrayList<>();
        for (Milestone milestone : milestones) {
            for (Task task : milestone.tasks) {
                if (task.isCritical) {
                    taskArrayList.add(task);
                }
            }
        }
        return taskArrayList;
    }

    Milestone getMilestone() {
        System.out.println("Enter the milestone by index");
        for (int i = 0; i < milestones.size(); i++) {
            System.out.println(i + ": " + milestones.get(i).name);
        }
        int temp = Main.scanner.nextInt();
        System.out.println("Chosen " + milestones.get(temp).name);
        return milestones.get(temp);
    }

    void calcPerc() {
        percentage = (getCompletedMilestones() / milestones.size()) * 100;
    }

    float getCompletedMilestones() {
        float counter = 0.0f;
        for (Milestone milestone : milestones) {
            milestone.calcPerc();
            if (milestone.isComplete) {
                counter++;
            }
        }
        return counter;
    }

    void checkCriticalTasks() {
        for (Milestone milestone : milestones) {
            for (Task task : milestone.tasks) {
                if (projectDay > task.deadline) {
                    task.isCritical = true;
                }
            }
        }
    }

    void checkComplete() {
        for (Milestone milestone : milestones) {
            for (Task task : milestone.tasks) {
                if (!task.isComplete) {
                    isComplete = false;
                    return;
                }
            }
        }
        isComplete = true;
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

    void checkComplete() {
        int notComplete = 0;
        for (Task task : tasks) {
            if (!task.isComplete) {
                notComplete++;
            }
        }
        isComplete = notComplete == 0;
    }

    void calcPerc() {
        percentage = (getCompletedTasks() / tasks.size()) * 100;
    }

    float getCompletedTasks() {
        float counter = 0.0f;
        for (Task task : tasks) {
            if (task.isComplete) {
                counter++;
            }
        }
        return counter;
    }

    void addTask(String name, int deadline, Employee assignedEmployee) {
        tasks.add(new Task(name, deadline, assignedEmployee));
    }
}

class Task {
    String name;
    int deadline;
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