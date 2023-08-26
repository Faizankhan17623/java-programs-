class abc{
    int x;
    static int y;

     void m1()
    {
        System.out.println("this is an non static method");
        System.out.println(x);
        System.out.println(y);
    }   
    
    static void m2()
    {
        System.out.println("this is an static method");
        System.out.println(y);
    }

}

class main
{
    public static void main(String args[]){
        abc ob = new abc();
        ob.m1();
        abc.m2();

    }
}