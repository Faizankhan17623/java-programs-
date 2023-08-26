class bank{
    private String name;
    private int accno;
    private float balance;

    public void a1()
    {
        name ="faizan";
        accno = 12578;
        balance = 25000f;
    }

    public void a2()
    {
        System.out.println("your name is :"+name);
        System.out.println("your accno is :"+accno);
        System.out.println("your bank balance is"+balance);
    }


}

class bmain{
    public static void main(String args[]){
        bank b1 = new bank ();
        b1.a1();
        b1.a2();
    }
}