class demo{
    void m1(){
        System.out.println("This the the m1 function");
    }    
    void m2(){
        System.out.println("This is the m2 function");
    }
    static void m3(){
        System.out.println("This the first static block");
    }
    static{
        System.out.println("This the second static block");
    }
}
class main{
    static{
        System.out.println("block of main class");
    }
    public static void main(String args[]){
    System.out.println("We are the main method");
    // demo.m3();
    demo d =new demo();
    d.m1();
    d.m2();
    }
}