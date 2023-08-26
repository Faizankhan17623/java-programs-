    class abc{

    abc()  //creating constructor no argumnet constructor
    {
        System.out.println("this is a  no argument constructore");
    }

    abc(int x) //creating an argument constructor
    {
        this();//used to  call constructor explicitelley 
        System.out.println("this is an argument constructore"+x);
    }
    abc(int a,int b)
    {
        this(43);
        System.out.println("two parameterized constructor"+a +b);
    }

    public void c1()
    {
        System.out.println("printthe c1 statement ");
        c2();
    }

    public void c2()
    {
        System.out.println(" hello world");
    } 

    
}

class test{
    public static void main(String abcd[])
    {
        abc ob = new abc(5);
        ob.c1();
    }
}