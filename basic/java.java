import java.util.*;
public class java {
    public static void main(String args[]){
        int num1 ,num2 ,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("EnterFirst  number");
        num1 =sc.nextInt();

        System.out.println("Enter second number");
        num2 = sc.nextInt();

        sc.close();
        sum = num1+num2;
       System.out.println("sum of these numbers:"+sum);
    }
}
