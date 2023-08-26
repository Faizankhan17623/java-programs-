// code oops concept
// create a class of 3 student  having different marks in name and roll
class experiment{
    private int roll;
    private String name;
    private float mks;
    
public void  m1(int r,String n,float m)
{
    roll =r;
    name =n;
    mks = m;
}

public void m2()
{
    System.out.println("\tRoll number :" +roll);
    System.out.println("\tyour name is :" +name);
    System.out.println("\tyour marks are :" +mks);
}
}

class main{
    public static void main(String args[]){
        experiment e1 = new experiment();
        // creating method to access private class+
        e1.m1(45,"faizan",65f); // this line is called current object
        e1.m2();
        e1.m1(46,"",99f); //this line is called current object
        e1.m2();
        e1.m1(56,"khan",98f); // this line is called current object
         e1.m2();
    }
}