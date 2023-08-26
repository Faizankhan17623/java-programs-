// in this code we are going to use setters method

class employee3{
    private int id;
    private String name;
    private long salary;   
    

    // NOW E ARE GOING TO PRINT THE CLASS USING COMBINE SETTING
    public void faizan(int i,String s,long l)
    {
        id =i;
        name =s;
        salary = l;
    }

    // public void setId(int i)
    // {
    //     id=i;
    // }

    // public void setName(String s)
    // {
    //     name = s;
    // }

    // public void setSalary(long l)
    // {
    //     salary=l;
    // }
        // getters are generalley no parameterized bt with return
    public long getSalary()
    {
        return salary;
    }
    public  String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }


    public void display()
    {
        System.out.println("your id is:"+id);
        System.out.println("your name is:"+name);
        System.out.println("your salary is:"+salary);

    }
}


class Testss{
    public static void main(String argsp[]){
    employee3 ob =new employee3();
        // ob.faizan(11,"faizan",210000);
    // ob.setId(111);
    // ob.setName("faizan");
    // ob.setSalary(25000);
    // ob.display();

    // employee3 ob1 =new employee3();
    // ob1.setId(222);
    // ob1.setName("khan");
    // ob1.setSalary(25000);
    // ob1.display();

    // employee3 ob2= new employee3();
    // ob2.setId(333);
    // ob2.setName("mamu");
    // ob2.setSalary(25450);
    // ob2.display();

    // employee3 ob3 = new employee3();
    // ob3.setId(444);
    // ob3.setName("dadu");
    // ob3.setSalary(254);
    // ob3.display();


    System.out.println("salary"+ob.getSalary());
    System.out.println("name:"+ob.getName());
    System.out.println("id:"+ob.getId());
    }
}