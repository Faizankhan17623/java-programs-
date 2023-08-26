 class person{
    private int age;
    private String name;
    private long uid;

    public person(){
    age = 0;
    name = null;
    uid = 0 ;
    }
    public person(int age,String name,long uid){  //parameterized constructor
        this.age = age;
        this.name = name;
        this.uid = uid;
    }
    public void display(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(uid);
    }
}
