import java.io.*;
class Employee{
    private int id;
    private String name;
    private float salary;

    public void accept(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Enter id:");
            id = Integer.parseInt(br.readLine());
            System.out.print("Enter name:");
            name = br.readLine();
            System.out.print("Enter salary:");
            salary = Float.parseFloat(br.readLine());
        }catch(Exception e){
            System.out.println(" handled");
        }
    }
    public void display(){
        System.out.print(id+"\t\t"+name+"\t\t"+salary+"\n");
    }
}
class TestEmployee{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.accept();
        e1.display();

        Employee e2 = new Employee();
        e2.accept();
        e2.display();

        int i,n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many Employees");
        try{
            n = Integer.parseInt(br.readLine());
        }catch( Exception sdaf){}

        Employee erp[] = new Employee[n];

        for(i=0;i<n;i++){
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter how many employees");
            try{
                n = Integer.parseInt(br.readLine());
            }catch(Exception sdaf){}

            Employee emp[] = new Employee[n];

            for(i=0;i<n;i++){
                emp[i] = new Employee();
                emp[i].accept();
            }

            System.out.println("All Employeers are as follows");
            for(i=0;i<emp.length;i++)
            emp[i].display();
        }

    }
}
