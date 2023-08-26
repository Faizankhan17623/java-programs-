import java.util.*;
class student{
    private int roll;
    private String name;
    private float marks;

     public student(int a,String  b,float c)
    {
        roll=a;
        name=b;
        marks=c;
    }

    public void display()
    {
        System.out.println("your roll is"+roll);
        System.out.println("your name is"+name);
        System.out.println("your marks are"+marks);
    }


}

class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        // int n;
        // String m;
        // float f;
        // System.out.println("Enter roll");
        // n=sc.nextInt(); 
        // System.out.println("Enter name");
        // m=sc.next();
        // System.out.println("Enter marks");
        // f=sc.nextFloat();
        // s.display();
        // student s=new student(n,m,f); 
        
        
    }
}