package polymorphism;

// 3. Changing the Order of Parameters
class Student {

    public void studentId(String name ,int rollno ){
        System.out.println("Name "+name +" Roll No "+rollno);
    }
    public void studentId(int rollno , String name){
       System.out.println("Rollno "+rollno+" Name "+name);
    }
    
}
