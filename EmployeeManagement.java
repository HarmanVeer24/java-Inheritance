//main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee teamLead = new Manager("Harman", 1, 80000, 5);
        Employee softwareEngineer = new Developer("Ritish", 2, 60000, "Java");
        Employee juniorIntern = new Intern("Ansh", 3, 20000, 6);

        teamLead.displayDetails();
        softwareEngineer.displayDetails();
        juniorIntern.displayDetails();
    }
}

// Base class representing an employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

// Derived class representing a manager
class Manager extends Employee {
    int teamSize;

    // Constructor to initialize manager details
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overridden method to display manager-specific details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Derived class representing a developer
class Developer extends Employee {
    String programmingLanguage;

    // Constructor to initialize developer details
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method to display developer-specific details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Derived class representing an intern
class Intern extends Employee {
    int duration;

    // Constructor to initialize intern details
    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Overridden method to display intern-specific details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

//output
// Name: Harman, ID: 1, Salary: 80000.0
//Team Size: 5
//Name: Ritish, ID: 2, Salary: 60000.0
//Programming Language: Java
//Name: Ansh, ID: 3, Salary: 20000.0
//Internship Duration: 6 months