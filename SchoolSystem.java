// Main class to test the School System
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating instances of different roles in the school system
        Teacher mathTeacher = new Teacher("Ritu Sharma", 35, "Mathematics");
        Student highSchoolStudent = new Student("Harman", 16, 10);
        Staff adminStaff = new Staff("Tajinder Singh", 40, "Administration");

        // Displaying information for each person
        System.out.println("Teacher Details:");
        mathTeacher.displayBasicInfo();
        mathTeacher.displayRole();
        System.out.println();

        System.out.println("Student Details:");
        highSchoolStudent.displayBasicInfo();
        highSchoolStudent.displayRole();
        System.out.println();

        System.out.println("Staff Details:");
        adminStaff.displayBasicInfo();
        adminStaff.displayRole();
    }
}

// Superclass Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass Student
class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
//output
// Name: Ritu Sharma
//Age: 35
//Role: Teacher
//Subject: Mathematics
//
//Student Details:
//Name: Harman
//Age: 16
//Role: Student
//Grade: 10
//
//Staff Details:
//Name: Tajinder Singh
//Age: 40
//Role: Staff
//Department: Administration