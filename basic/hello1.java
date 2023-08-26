class Student {       //instance variable or data members
    private int roll;
    private String name;
    private float mks;

    public void fun1(int a,String b,float c){ //Member Function
        roll =a;
        name=b;
        mks=c;
    }
    public void fun2(){     //Member Function 
        System.out.println("Roll number :"+roll);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+mks);
    }

}
    class TypeStudent{
    public static void main(String abcd[]){
        Student st1 = new Student();
        st1.fun1(111,"abcd",75.0f);
        st1.fun2();

        Student st2=new Student();
        st2.fun1(222,"efgh",63.89f);
        st2.fun2();
    }
}