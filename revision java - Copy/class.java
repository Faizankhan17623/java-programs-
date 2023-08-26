// inn this code we will learn how to create a class and access it using  object
class example{
    private int rollno;
    private String name;
    private float salary;


    public void ob1()
    {
        rollno = 98;
        name = "faizan";
        salary = 25.000f;
    }
    public void ob2()
    {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(salary);

    }
}

class main{
    public static void main (String args[]){
        example c1 = new example();
        c1.ob1();
        c1.ob2();
    }
}
