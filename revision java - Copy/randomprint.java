import java.util.*;
class rp{
    public static void main(String args[]){
        Random r =new Random();
        Scanner sc =new Scanner(System.in);

        int a,b;
        a=r.nextInt(10);
        System.out.println("the first number is"+a);
        b=r.nextInt(10);
        System.out.println("The second number is "+b);
        int sum=a+b;
        System.out.println("the numbers are :"+sum);
    }
    
}
