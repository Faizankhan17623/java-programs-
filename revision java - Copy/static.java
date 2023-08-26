class abc{
    private int id;
    private String name;
    private static String companeyName="tcs"; 

    abc(int a,String b)
    {
        id =a;
        name =b;
    }

    public void Display()
    {
        System.out.println("your id is "+id);
        System.out.println("your id is "+name);
        System.out.println("your id is "+companeyName);

    } 
}

class test{
    public static void main(String args[]){
        abc ob = new abc(111,"faizan");
        abc ob1 = new abc(111,"faizan");
        abc ob2 = new abc(111,"faizan");


                    ob.Display();
                    ob1.Display();
                    ob2.Display();
                    
    }
}
