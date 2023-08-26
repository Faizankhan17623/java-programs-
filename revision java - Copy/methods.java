// printing value is metods function
class methods{
    public void m1(){
        System.out.println("parameter but with no return value");
    }

    public void m2(int a,float  b){
        System.out.println("parameter but with no return");
        System.out.println("the output for parameter is"+a);
         System.out.println("the output for parameter is"+b);

    }

    public void m3(boolean x,String y){
        System.out.println("parameters but with a return value");
        System.out.println("the value of boolena is "+x);
        System.out.println("the value of string is "+y);
    }
}

class teeest{
    public static void main(String args[]){
        methods ob = new methods();

        ob.m2(5,2.5f);
        ob.m3(true,"abcd");
    }
}
