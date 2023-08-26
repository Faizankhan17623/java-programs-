class abc{
    int a;
    float b;
    double c;

    public void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}

class main{
    public static void main(String args[]){
        abc ob = null;   //here ob is an reference
        ob = new abc();  //now ob has become an  object
        ob.display();

        abc ob1= new abc();
        ob1.display();
        
        
        new abc().display();   //annanoymus object
    }
}
