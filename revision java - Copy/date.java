// import java.util.Date;

// using date classs in java

import java.text.*;
import java.util.*;
class date{
    public static void main(String args[]){
    //    java.util. Date d =new java.util.Date();
    //    System.out.println(d);
    //    System.out.println("Hours :"+d.getHours());
    //    System.out.println("Minutes :"+d.getMinutes());
    //    System.out.println("Seconds :"+d.getSeconds());

    // printing simple date format

            Date d =new Date();
            System.out.println(d);

            SimpleDateFormat sdf =new SimpleDateFormat("dd/mm/yyy");
            System.out.println(sdf.format(d));

    }
    
}
