// in this code we are going to see how to create class and acces it from outside
// to access private data we need public class so let;s create it


// creating class 
class employee{
    private int id;
    private float salary;
    private String name;
};



// creating class to access the data
public void fun1(){
    id = 111;
    name = "faizan";
    salary = 21.000f;
}

// creating class to access the data

public void fun2(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(salary);

}
class test{
    public static void main(String args[]){
        // creating object for class
        employee c1 = new employee();
        c1.fun1();
        c1.fun2();
    }
}