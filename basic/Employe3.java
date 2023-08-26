import java.io.*;
class Employee{
    private int id;
    private String name;
    private float Salary;
    public void setId(int x){
        id = x;
    }
    public void setName(String y){
        name = y;
    } 
    public void setSalary(float z){
        Salary = z;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return Salary;
    }
}
class TestEmployee{
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(system.in));
            int tid;
            String tname;
            float tsalary;
            
            System.out.print("Enter id:");
            tid = Integer.parseInt(br.readLine());
            System.out.print("Enter name:");
            tname = br.readLine();
            System.out.print("Enter salary:");
            tsalary = Float.parseFloat(br.readLine());

            Employee e1 = new Employee();
            e1.setId(tid);
            e1.setName(tname);
            e1.setSalary(tsalary);

            System.out.println(e1.getId()+"\t\t"+e1.getName()+"\t\t"+e1.getSalary());

            System.out.print("Enter id:");
            tid =Integer.parseInt(br.readLine());
            System.out.print("Enter name");
            tname = br.readLine();
            System.out.print("Enter salary");
            tsalary = Float.parseFloat(br.readLine());

            Employee e2 = new Employee();
            e2.setId(tid);
            e2.setName(tname);
            e2.setSalary(tsalary);

            System.out.println(e2.getId()+"\t\t"+e2.getName()+"\t\t"+e2.getSalary());


            int n,i;
            System.out.print("Enter how many employees");
            n = Integer.parseInt(br.readLine());

            Employee emp[] = new Employee[n];

            for(i=0;i<emp.length;i++){
                System.out.print("Enter id");
                tid = Integer.parseInt(br.readLine());
                System.out.print("Enter name");
                tname =br.readLine();
                System.out.print("Enter salary");
                tsalary = Float.parseFloat(br.readLine());

                emp[i] = new Employee();

                emp[i].setId(tid);
                emp[i].setName(tname);
                emp[i].setSalary(tsalary);
            }

            System.out.println("All employees are as follows");
            for(Employee x:emp)
                System.out.println(x.getId()+"\t\t"+x.getName()+"\t\t"+x.getSalary());
        }catch(Exception e){}
    }
}