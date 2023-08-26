import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String str;
        System.out.println("enter name");
        str=sc.next();

        int a;
        System.out.println("enter id");
        a=r.nextInt(50);

        int b;
        System.out.println("enter marks");
        b=r.nextInt(100);

        
        System.out.println("your details are"+str);
        System.out.println("enter your id"+a);
        System.out.println("your marks are"+b);
    }
}
