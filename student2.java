public class student {
    String name;
    int age;
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
public class Student {
    public static void main(String[] args) {
        int Student;
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();
    }
}
    
