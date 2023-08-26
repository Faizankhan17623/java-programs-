class student{
    private int id;
    private String name;
        static int cnt;

    student(int a,String b){
        id =a;
        name =b;
        cnt++;
    }

    public void display()
    {
        System.out.println("your id is:"+id);
        System.out.println("your name is :"+name);
    }

    public static void show(){
        System.out.println("the numbers of value are"+cnt);
    }
    
}

class main111{
    public static void main(String args[])
    {
        student ob = new student(111,"faizan");
        ob.display();
         student ob1 = new student(111,"faizan");
                 ob1.display();

         student ob2 = new student(111,"faizan");
         ob2.display();
         student ob3 = new student(111,"faizan");
         ob3.display();
         student ob4 = new student(111,"faizan");
         ob4.display();
         student ob5 = new student(111,"faizan");
         ob5.display();
         student ob6 = new student(111,"faizan");
          ob6.display();
         student ob7 = new student(111,"faizan");
          ob7.display();
         student ob8 = new student(111,"faizan");
          ob8.display();
         student ob9 = new student(111,"faizan");
          ob9.display();
         student ob10 = new student(111,"faizan");
          ob10.display();


         student.show();

    }
}
