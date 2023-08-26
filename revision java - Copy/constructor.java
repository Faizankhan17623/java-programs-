class student{
    private String name;
    private int roll;
    private float mks;

    student()  //constructore
    {
        System.out.println("constructorr with no parameter");
    }

    student (int x,String y,float m)//constructor
    {
        roll=x;
        name =y;
        mks=m;
    }

    student (int x,float y) //creating constructor
    {
        roll=x;
        mks=y;
    }

    student (float x,String s)  //creating construtor
    {
        mks=x;
        name=s;
    }

    public void display()//creating method
    {  
        System.out.println(name);
        System.out.println(roll);
        System.out.println(mks);
    }
}


class test{
    public static void main(String args[]){
       student st = new student();
       student st1  = new student(22,"Faizan",99f);
       student st2 = new student(33,75f);
       student st3 = new student(98f,"faizan");
        st.display();
        st1.display();
        st2.display();
        st3.display();       
    }
}