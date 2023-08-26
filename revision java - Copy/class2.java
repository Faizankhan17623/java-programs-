import java.util.*;
class student{
    // creating private data
    private int roll;
    private String name;
    private float marks;

    // creating m1 method
    public void accept()
    { 
        Scanner sc =new Scanner(System.in);
        System.out.println("enter roll number");
        roll=sc.nextInt();

        System.out.println("Enter your name");
        name=sc.next();

        System.out.println("Enter marks");
        marks= sc.nextFloat();

    }
    // creating m2 method
    public void display(){
        System.out.println(roll+"\t"+name+"\t"+marks+"\t");
    }
}
class test{
    public static void main(String args[]){
        // object of student class
        // student st =new student();
        // calling the class using object
        // st.m1();
        // st.m2();

        // now we will print using array of objects
        // now we will call the sacnner class in our main class 
        int a;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter how many times");
        a=sc.nextInt();

        student ss[] = new student[a];
        int i;
        for(i=0;i<a;i++){
            ss[i]=new student();
            ss[i].accept();
        }

        System.out.println("all students define are as follow");
        System.out.println("roll\tname\tmarks");
        for(i=0;i<a;i++){
            // ss[i]=new student();
            ss[i].display();
        }

        // for(student t: ss)
            // t.display();
    }
}