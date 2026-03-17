package array_study;

public class ArrayExample {
    public static void main(String[] args) {
        // create the array 
        // create array 
        // declare the array + initialize the array 

        int marks[] = {90,67,98,87,65,54,55};
        // print the values 
        System.out.println(marks[0]);
        System.out.println(marks[6]);
        System.out.println(marks[marks.length-1]);


        // check the length of array 
        System.out.println(marks.length);

        // declare the array 
        // int failedStudentMarks[];
        // // initialize the array 
        int size = 4;
        // declare + initialize 
        int failedStudentMarks[] = new int[size];

        System.out.println(failedStudentMarks[0]);
        System.out.println(failedStudentMarks[1]);

        System.out.println("--------------------");
        // print all the data of marks array [ array traverse ]

        // all the data of marks

        for(int i = 0; i < marks.length; i++){
            System.out.println("the value at index "+i+" is "+marks[i]);
        }

        // enhance / for-each

        for(int value:marks){
            System.out.println(value);
        }

        // modify the array element

        marks[0] = 200;

         // all the data of marks
          System.out.println(" after modification--------------------");

        for(int i = 0; i < marks.length; i++){
            System.out.println("the value at index "+i+" is "+marks[i]);
        }

    }
}

