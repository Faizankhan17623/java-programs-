// read and print data of employee using accept and display using array of objects
import java.util.*;
class employee{
    private int id;
    private String name;
    private float salary;
    
    public void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your id:");
        id =sc.nextInt();
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your salary:");
        salary=sc.nextFloat();
    }

    public void display()
    {
        System.out.println(+id+name+salary);
    }
}

class mainTest{
    public static void main(String args[]){
        // employee em =new employee();
        Scanner sc =new Scanner(System.in);

        int a;
        System.out.println("Enter how many times");
        a=sc.nextInt();

        employee b[] = new employee[a];
        int i;
        for(i=0;i<a;i++){
            b[i]=new employee();
            b[i].accept();
        }
        System.out.println("your details are :");
        System.out.println("id\tname\tsalary");

        for(i=0;i<a;i++){
            b[i].display();
        }
    }
}