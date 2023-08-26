class student1{
    private int roll;
    private float mks;
    private String name;
    
    public void setstudent1(int x,float y,String z)
    {
        roll = x;
        mks = y;
        name=z;
    }

    public void display()
    {
        System.out.println("your roll number is"+roll);
        System.out.println("your roll number is"+mks);
        System.out.println("your roll number is"+name);
 
    }
}

class main12{
    public static void main(String args[]){
        student1 st;
        st=new student1();

        student1 x;
        x=new student1();

        student1 ob =new student1();


        student1 s[]=new student1[100];
            for(int i=0;i<s.length;i++) 
            s[i] = new student1();


            s[0].setstudent1(111,234f,"faizan");
            s[1].setstudent1(12, 200, "khan");


            for(int j=0;j<s.length;j++)
            s[j].display();
            
            for(student1 : s);
            s1.display();
    }
} 
