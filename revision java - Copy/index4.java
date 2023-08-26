import java.util.*;
class index{
    public static void main(String args[]){
        Random r =new Random();

        int a;
        System.out.println("Enter a number");
        a=r.nextInt(100);

        int b[] =new int[a];
        int i;
        for(i=0;i<a;i++){
            i=r.nextInt(100);
        }

        System.out.println("the numbers are");
            for(i=0;i<a;i++)
            System.out.println(b[i]);

    }    
}
