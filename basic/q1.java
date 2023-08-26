import java.util.*;

class Student{
    private int roll;
    private String name;
    private float total;
    private int nos;
    private float avg;

    public Student(){
        this.roll =0;
        this.name = null;
        this.total =1.f;
        this.nos = 1;
        this.avg = this.total/this.nos;   
    }

    public Student(int r, String n, float t, int no){
        this.roll =r;
        this.name = n;
        this.total = t;
        this.nos = no;
        this.avg = this.total/this.nos;   
    }

    public void display(){
        System.out.println(roll+"\t"+name+"\t"+avg);
    }
    public String tostring(){
        return ""+roll+"\t"+name+"\t"+avg;
    }
    public static int SearchStudent(Student st[],int x){
        int i;
        int loc =1;
        for(i=0;i<st.length;i++){
            if(x == st[i].roll){
                loc =i;
                break;
            }
        }
        return loc;
    }
}

class test{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n,i,x;
        int troll;
        String tname;
        float ttotal;
        int tnos;

        System.out.println("Enter how many stdents");
        n  = sc.nextInt();

        Student st[] = new Student[n];
        for(i=0;i<n;i++){
            System.out.println("Enter roll number:");
            troll = sc.nextInt();
            System.out.println("Enter name");
            tname = sc.next();
            System.out.println("Enter total marks");
            ttotal = sc.nextFloat();
            System.out.println("Enter total number of subjects:");
            tnos = sc.nextInt();
            st[i] = new Student(troll,tname,ttotal,tnos);
        }

        for(i=0;i<n;i++)
            System.out.println(st[i]);


            System.out.println("Enter roll number to be searched");
            x = sc.nextInt();

            int l = Student.SearchStudent(st,x);
            
            if(l==1)
                System.out.println("Student not found");
            else{
                System.out.println("Student found");
            
            st[l].display();
            } 


        }
}