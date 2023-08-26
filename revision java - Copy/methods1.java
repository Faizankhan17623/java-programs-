// in this code we are going to store ans inside the main method 

class store{
    public  void m1()
    {
        System.out.println("m1 is a parameter that is not going to return anythinng");
    }

    public void m2(int a,float b)
    {
        System.out.println("m2 method a metod with parameter but not going to return anything");
        System.out.println(+a);
        System.out.println(+b);
    }
    public int m3()
    {
        System.out.println("method with no parameter but return");
        int a =10;
        int b=20;
        int c=a+b;
        return c;
    }
    public boolean m4(int m,int n){
        System.out.println("methods with parameter and return ");
        if (m>n)
            return  true;
            else 
            return false;
        }   
    }


class main123{
    public static void main(String args[]){
        store st =new store();
        st.m1();
        st.m2(5,555f);

        // storing value inside parameter and returning it
        // int c;
        // c= st.m3();
        System.out.println(st.m3());
        if(st.m4(25,40))
        System.out.println(true);
        else
        System.out.println(false);
    }
}
