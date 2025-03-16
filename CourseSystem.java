// Main class
public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("Java-Fundamentals", 40);
        OnlineCourse onlineCourse = new OnlineCourse("C++ Course", 50, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Mern-Stack", 100, "Coursera", true,5000, 10.0);

        System.out.println("Course: " + course.courseName);
        System.out.println("Online Course Platform: " + onlineCourse.platform);
        System.out.println("Paid Course Fee: " + paidCourse.fee);
    }
}
// Base class Course
class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}

// Subclass OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
//output
// Course: Java-Fundamentals
//Online Course Platform: Udemy
//Paid Course Fee: 5000.0