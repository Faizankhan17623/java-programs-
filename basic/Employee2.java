import java.io.*;
class Employee{
    private int id;
    private float salary; 
    private String name;

    public Employee(int x,String y,float z){
        id = x;
        name = y;
        salary = z;
}
    public void display(){
        System.out.println(id+"\t\t"+name+"\t\t"+salary);
    }
}

class TestEmployee{
    public static void main(String args[]){
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try{
            int tid;
            String tname;
            float tsalary;

            System.out.print("Enter id");
            tid = Integer.parseInt(br.readLine());
            System.out.print("Enter name:");
            tname = br.readLine();
            System.out.print("Enter salary:");
            tsalary = Float.parseFloat(br.readLine());

            Employee e1 = new Employee(tid,tname,tsalary);
            e1.display();

            System.out.println("Enter id");
            tid = Integer.parseInt(br.readLine());
            System.out.print("Enter name:");
            tname = br.readLine();
            System.out.println("Enter salary:");
            tsalary = Float.parseFloat(br.readLine());

            Employee e2 = new Employee(tid,tname,tsalary);
            e2.display();

            int i,n;
            System.out.print("Enter how many Employees:");
            n = Integer.parseInt(br.readLine());
            
            Employee emp[]=new Employee[n];
            for(i=0;i<emp.length;i++){
                System.out.print("Enter id:");
                tid = Integer.parseInt(br.readLine());
                System.out.print("Enter name:");
                tname = br.readLine();

                System.out.print("print salary");
                tsalary = Float.parseFloat(br.readLine());

                emp[i] = new Employee(tid,tname,tsalary);
            }

            System.out.println("All employees are done");
            for(Employee t:emp)
                t.display();


        }catch(Exception e){}
    }
}
