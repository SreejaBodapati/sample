package oops;

public class Student_2 {
    int rollno;
    String name;
    char grade;

    public Student_2(int rollno, String name, char grade) {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student_2 student = new Student_2(101, "Rahul", 'A');
        student.printDetails();
    }
}