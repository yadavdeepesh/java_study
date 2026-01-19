package static_study;

class Student {
    int rollno;
    String name;

    // create static variable 
    static int a = m1();

    Student(int rno, String n){
        rollno = rno;
        name = n;
    }
    // create the static block
    static{
        System.out.println("create static execute below main method..");
    }
    // create static variable 
    static String department = "IT"; 
    void display(){
        System.out.println("Roll No :: "+rollno+" name :: "+name+" department :: "+department);
    }

    // create the static method ..
    static int m1(){
         System.out.println("From m1");
        return 20;
    }

    
}
