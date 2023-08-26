// int this code we are just going to read and print the data of array
import java.util.*;
class index{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r =new Random();
        int x;
        int sum=0;
        System.out.println("Enter how many numbers");
        x=sc.nextInt();

        int y[]=new int[x];
        int i;
            for(i=0;i<x;i++)
            {
                y[i]= r.nextInt(50);
                sum= sum + y[i];
            }
            
            System.out.println("numbers are");
            for(int t:y)
                System.out.println(x+" ");
            // for (i=0;i<x;i++)
            // System.out.println(y[i]);

            System.out.println("thew sum is "+sum);
    }
}