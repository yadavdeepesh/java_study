package static_study;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(12,"deepesh yadav ");
        s1.display();
        Student s2 = new Student(13, "Ravi Teja ");
        s2.display();
        System.out.println("Value of a: " + Student.a);
        System.out.println("From main");
    }
}
