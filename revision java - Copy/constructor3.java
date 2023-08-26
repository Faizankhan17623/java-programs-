class employee{
    private int id;
    private float accno;
    private double balance;
    private String name;

    employee()   ///constructore
    {

    }

    employee(int a,float b,double c,String d)
    {
        id =a;
        accno = b;
        balance =c;
        name =d;
    }

    employee(employee emp)
    {
        id=emp.id;
        accno=emp.accno;
        balance =emp.balance;
        name = emp.name;
    }

    public void display()
    {
        System.out.println("your id is"+id);
        System.out.println("your balance is"+accno);
        System.out.println("your accno is"+balance);
        System.out.println("your name is"+name);
    }
}


class test{
    public static void main(String args[])
    {
        employee ob1 = new employee(5,25.000f,56f,"Faizan");
        ob1.display();

        employee ob2 = new employee(ob1);
        ob2.display();

        employee ob3 = new employee(ob1);
        ob3.display();

    }
}
