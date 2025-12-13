

public class Student {
    // create two variables
    int id;
    String name;
    // create the constructor 
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void viewDisplay(){
      System.out.println("id "+id);
      System.out.println("name "+name);
    }
}