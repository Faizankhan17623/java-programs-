class main34{
    public static void main(String args[]){
        Utility ob =new Utility();
        // usng non static method
        // int ans;
        // ans = ob.Factorial(5);
        // System.out.println("the factorial of 5 is"+ob.Factorial(5));

        // ans=ob.Power(2,5);
        // // ob.Factorial(5);
        // System.out.println("the power i "+ans);
        

        // using static methods
        int ans;
        ans = Utility.Factorial(5);
        System.out.println("the factorial is "+ans);
        System.out.println("the power is "+Utility.Power(2,5));
    }
}
