

class methods3 {
   public void m1()
   {
    System.out.println("method mi with no parameter");
   }
   public void m1( int x)
   {
    System.out.println("methods with parameter"+x);
   }
   public void m1(String x,boolean y)
   {
     System.out.println("methods with parameter"+x);
     System.out.println("methods with parameter"+y);

   } 
}

class main11{
    public static void main (String args[]){
        methods3 ob = new methods3();
        ob.m1();
        ob.m1(2);
        ob.m1("faizan",true);

    }
}
