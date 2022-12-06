import java.util.ArrayList;
import java.util.Date;
class Department {
    public Department(String name, String address, Director departmentDirector) {
        this.name = name;
        this.address = address;
        this.departmentDirector = departmentDirector;
    }

    ArrayList<Employee> employees = new ArrayList<>();
    String name;
    String address;
    Director departmentDirector;
}

class Employee extends Person {
    ArrayList<Project> projects = new ArrayList<>();

    public Employee(String name, String surname, Date birthday, float salary) {
        super(name, surname, birthday, salary);
    }
}

class Director extends Person {
    int experience;

    public Director(String name, String surname, Date birthday, float salary) {
        super(name, surname, birthday, salary);
    }
}

class Person {
    public Person(String name, String surname, Date birthday, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
    }

    String name;
    String surname;
    Date birthday;
    float salary;
    Department assignedDepartment;
    int assignedDepartmentStartDate;
    int assignedDepartmentEndDate;
}

class Project {
    float budget;

    public Project(float budget, String nome, int expiryDate) {
        this.budget = budget;
        this.nome = nome;
        this.expiryDate = expiryDate;
    }

    int expiryDate;
    String nome;
    ArrayList<Employee> employees = new ArrayList<>();
}