import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x;
        float y;
        System.out.println("Enter an integer number");
        x=sc.nextInt();
        System.out.println("your integer nmber is"+x);

        System.out.println("Enter a floating number");
        y=sc.nextFloat();
        System.out.println("your floating number is"+y);

        byte c;
        System.out.println("enter a byte");
        c=sc.nextByte();
        System.out.println("your byte number is"+c);

        String str;
        System.out.println("enter string");
        str=sc.next();
        System.out.println("the string is"+str);

        boolean f;
        System.out.println("enter a value");
        f=sc.nextBoolean();
        System.out.println("your value is"+f);

        String s2;
        s2=sc.nextLine();

        String s1;
        System.out.println("Enter a line");
        s1=sc.nextLine();
        System.out.println("your next line is"+s1);


    }
    
}
