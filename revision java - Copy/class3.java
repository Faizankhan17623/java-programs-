import java.util.*;
class student{
    private int roll;
    private String name;
    private float mks;


    public student(int n,String s,float m)
    {
        roll=n;
        name=s;
        mks=m;
    }

    public void display()
    {
        System.out.println(roll+"\t\t"+name+"\t\t"+mks);
    }
}

class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n;
        String str;
        float f;
        System.out.print("enter roll number");
        n=sc.nextInt();
        System.out.print("Enter a name");
        str=sc.next();
        System.out.print("enter marks");
        f=sc.nextFloat();
        student st1=new student(n,str,f);
        st1.display();
       

        System.out.print("enter roll number");
        n=sc.nextInt();
        System.out.print("Enter a name");
        str=sc.next();
        System.out.print("enter marks");
        f=sc.nextFloat();
        student st2=new student(n,str,f);
        st2.display();
        
        
        int a,i;
        System.out.println("Enter how many students");
        a = sc.nextInt();
        student st[]=new student[a];

        for(i=0;i<a;i++){
            System.out.println("Enter roll number");
            n=sc.nextInt();
            System.out.println("Enter a name");
            str=sc.next();
            System.out.println("enter marks");
            f=sc.nextFloat();

            st[i]=new student(a,str,f);
        }
        System.out.println("All student  are as follow");
        for(i=0;i<n;i++){
            st[i].display();
        }
    }
}
0