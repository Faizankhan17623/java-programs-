class main{
    public static void main(String args[]){
        String name[] =new String[5];
        name[0]="Faizan";
        name[1]="khan";
        name[2]="abcd";
        name[3]="bcdf";
        name[4]="faiza";

        // usinng .lenght method in loo///p
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);   ////;
        }
        // using advance for loop 
        for(String i:name);
        System.out.println(name);



        // using ld for loop technique
        // for(int i=0;i<5;i++){
            // System.out.println(name[i]);
        // }
    }
}