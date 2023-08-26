class employee{
    private int id;
    private String name;
    private static String cmpname="tcs";
    
    employee(int a,String b)
    {
        id = a;
        name = b;
    }

    public void display()
    {
        System.out.println("your id is"+id);
        System.out.println("your name is "+name);
        System.out.println("enter companey name"+cmpname);
    }

    public static void change(){
        cmpname="infosys";
    }

}

class test{
    public static void main(String args[]){
        employee ob = new employee(111,"faizan");
        employee ob1 = new employee(222,"khan");
        employee ob3 = new employee(333,"babu ");
         employee ob4 = new employee(333,"babu ");

         ob.display();
         ob1.display();
         ob3.display();
         ob4.display();

         employee.change();
         ob.display();
         ob1.display();
         ob3.display();
         ob4.display();



    }
}
