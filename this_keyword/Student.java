package this_keyword;

class Student extends Person{
    Student(){
        // invoke or call parent class constructor
        super();
        System.out.println("This is constructor of Student class ");
    }
    void message(){
        super.message();;
         System.out.println("This is message create by student class");
    }
        public boolean isTrue()
    {
        // calls parent implementation of isTrue()
        boolean parentResult = super.isTrue();
        // negates the parent result
        return !parentResult;
    }
}
