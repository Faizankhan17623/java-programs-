import java.util.*;
class employee{
    private int id;
    private String name;
    private float balance;

    public void set(int a,String b,float c)
    {
        id=a;
        name=b;
        balance=c;
    }
    // public void setName(String b)
    // {
    //     name=b;
    // }
    // public void setBalance(float c)
    // {
    //     balance =c;
    // }



    public int getId()
    {
        return id;
        // return name;
        // return balance;
    }
    public String getName()
    {
        return name;
    }

    public float getBalance()
    {
        return balance;
    }
}

class Testmain{
    public static void main(String args[]){
        int a;
        String b;
        float c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your id:");
        a=sc.nextInt();
        System.out.print("enter your name:");
        b=sc.next();
        System.out.print("Enter your balance :");
        c=sc.nextFloat();
        employee em=new employee(); 
        em.set(a,b,c);
        System.out.println(em.getId());
        System.out.println(em.getName());
        System.out.println(em.getBalance());
        // em.setName(b);
        // em.setBalance(c);
    }
}
