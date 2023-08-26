class bank{
    private String name;
    private long accno;
    private int balance;
    private static String branch="mahanagar";
            static int cnt;

    bank(String a,long b,int c)
    {
        name=a;
        accno=b;
        balance=c;
        cnt++;
    }

    public void Display()
    {
        System.out.println("your name is :"+name);
        System.out.println("your acc no :"+accno);
        System.out.println("your balance is:"+balance);
        System.out.println("branch name is :"+branch);
    }
    public static void show()
    {
        System.out.println("your number is :"+cnt);
    }

}


class MainBank{
    public static void main (String args[]){
        bank bb = new bank("Faizan",002546,25000);
        bb.Display();

        bank bb1 = new bank("Faizan",0025446,250400);
        bb1.Display();

        bank bb2 = new bank("Faizan",0025446,250400);
        bb2.Display();

        bank.show();
    }
}
