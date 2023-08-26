// int this code we are going to compare random and scanner class using next int method
import java.util.*;
class index{
    public static void main(String args[]){
        Random r=new Random();
        Scanner sc= new Scanner(System.in);

        int a,b;
        int x,y;

        // System.out.println("Enter a number");
        // a=sc.nextInt();
        // System.out.println("Enter second number");
        // b=sc.nextInt();

        // System.out.println("The adddition of +a+ and +b+ is :"+(a+b));

        // System.out.println("This adition is done using scanner class ");


        // now we will do using random class
        x=r.nextInt(100);
        y=r.nextInt(100);
        System.out.println("The adddition of +1+ and +2+ is :"+(x+y));



    }
    
}
