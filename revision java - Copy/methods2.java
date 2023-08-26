class xyz{
    private void m1()
    {
        System.out.println("This is a private class");
        // giving access of class to other public class
    }
    public void m2()
    {
        System.out.println("This ia a public class");
        // taking acess of private class and givng to the main function
        m1();
    }
}

class main{
    public static void main (String args[]){
        // creating object for xyz class
        xyz ob =new xyz();
        // declaring the object and calling methods inside it
        ob.m2();
    }
}
