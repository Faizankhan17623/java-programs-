// adding two number susing random
import java.util.*;
class add{
    public static void main(String args[]){
        Random r = new Random();

        int a,b,c;
        a=r.nextInt(10);    
        if(a == 7)
            System.out.println("you are lucky");
        else
            System.out.println("better luck next time");  
        // a=r.nextInt(10);
        // b=r.nextInt(5);
        // c= a+b;

        // System.out.println("the first random number is :"+a);
        // System.out.println("The second random number is "+b);
        // System.out.println("The total is"+c);

}
}
