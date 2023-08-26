// code from oops 

// creating a class and calling the private members
class employe{
    private int id;     //instance
    private float salary;  //instance
    private String name;   //instance


    // creating a public function for private class
public void fun1()    //variables
{
    id = 111;
    name = "faizan";
    salary = 21.000f;
}

public void fun2()    //variables
{
    System.out.println(id);
    System.out.println(name);
    System.out.println(salary);

}
}

// we have created total 5 methods 3 are instance and 2 are vaiables
class test{
    public static void main(String args[]){
        // creating object for class
        employe c1 = new employe();
        c1.fun1();
        c1.fun2();
        employe c2 = new employe();
        c2.fun1();
        c2.fun2();
        employe c3 = new employe();
        c1.fun1();
        c2.fun2();
        employe c4 = new employe();
        c1.fun1();
        c2.fun2();
        employe c5 = new employe();
        c1.fun1();
        c2.fun2();



    }
}