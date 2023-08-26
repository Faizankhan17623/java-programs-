// read and print data of employee using parameterized constructore and display()
// create only 2 different objects
class employeee{
    private int id;
    private String name;
    private float salary; 
    
    public employeee(int a,String b,float c)
    {
        id=a;
        name=b;
        salary=c;
    }
    public void display()
    {
        System.out.println(id+"\t\t"+name+"\t\t"+salary);
    }
}

class Testemp{
    public static void main(String args[]){
        employeee e1 =new employeee();
        e1.display();

    }
}
