// in this code we are going to create a clas and return it with parameters
class method{
    public void a1()
    {
        System.out.println("parameter with no return value");
    } 
    public void a2(int a,float b)
    {
        System.out.println("method is "+a);
        System.out.println("method is" +b);
    }

    public void a3(boolean b,float c)
    {
        System.out.println("ans is "+b);
        System.out.println("ans is "+c);


    }
    public void a4(int a,String c)
    {
        System.out.println("ans is "+a);
        System.out.println("ans is "+c);

    }
    public void a5(float b,float c)// this are the temporary variable created
    {
        System.out.println("ans is "+b);
        System.out.println("ans is "+c);

    }
    public void a6(String a,int b)
    {
        System.out.println("char is "+a);
        System.out.println("car is "+b);
    }
    public void a7()
    {
        System.out.println("hello7");
    }
    public void a8()
    {
        System.out.println("hello8");
    }
    public void a9()
    {
        System.out.println("hello9");
    }

}





class main1{
    public static void main(String args[]){
        method m1 = new method(); //the m1 that is created here is the object and you can access all class using it=
        m1.a2(5,2.5f);
        m1.a3(true ,9.8f);
        m1.a4(98,"faizan");
        m1.a5(67f,55f);
        m1.a6("abd",5);
        m1.a7();
        m1.a8();
        m1.a9();
    }
}
