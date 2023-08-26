import java.util.*;
class student{
    private int roll;
    private String name;
    private float mks;

    public void  setRoll(int a){
        roll=a;
    }

    public void setName(String b){
        name=b;
    }

    public void setMarks(float c){
        mks=c;
    }

    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

    public float getMarks(){
        return mks;
    } 
}


class main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a;
        String b;
        float c;
        System.out.print("Enter roll number");
        a=sc.nextInt();
        System.out.println("Enter your name");
        b=sc.next();
        System.out.print("enter your marks");
        c=sc.nextFloat();
        student st1=new student();


        st1.setRoll(a);
        st1.setName(b);
        st1.setMarks(c);
        System.out.print(st1.getRoll()+"\t\t"+st1.getName()+"\t\t"+st1.getMarks());

        // now using array of objects
        int n,i;
        System.out.println("enter how many objects");
        n= sc.nextInt();

        student st[] = new student[n]; //array of refernece

        for(i=0;i<n;i++){
        System.out.print("Enter roll number");
        a=sc.nextInt();
        System.out.println("Enter your name");
        b=sc.next();
        System.out.print("enter your marks");
        c=sc.nextFloat();
        
        st[i]=new student();
        st[i].setRoll(a);
        st[i].setName(b);
        st[i].setMarks(c);

        for(i=0;i<n;i++){
            System.out.println(st[i].getRoll()+"\t\t"+st[i].getName()+st[i].getMarks());
        }
        }
    }
}