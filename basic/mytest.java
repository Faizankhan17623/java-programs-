class student{
    private final int roll;
    private final float mks;

    student(int roll,float mks){
        this.roll = roll;
        this.mks = mks;
    }
    public void change(){

    }
    public void display(){
        System.out.println(this.roll);
        System.out.println(this.mks);
    }

}

class test{
    public static void main(String args[]){
        student s1 = new student (21,78);
        student s2 = new student (34,78); 
        s1.display();
        s2.display();
    }
}



















// class B{
//     static public void main(String asdf[]){
//         int a=5;
//         System.out.println(a);
//         a=7;
//         System.out.println(a);
//     }  
// }
