package access_modifier;

class Person{

    //default variable 
    String model;
    // private variable
    private String name;
    public void setName(String name){
        this.name = name;
    } 
    public String getName(){
        return name; 
    }
}
public class Geeks {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Deepesh");
        p.model = "testing";

        System.out.println(p.model);

        // System.out.println(p.name);
        //  // Error: 'name'
        // has private access
        System.out.println(p.getName());
    }
    
}
