package Strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String a = "Murshi";
        String b = "Murshi";
        String c = a;
        System.out.println(c == a);//it will give true
        //==
      //  System.out.println(a == b);


        String name1 = new String("Murshi");
        String name2 = new String("Murshi");
       // System.out.println(name1 == name2);//it will false because pointing to different objects
        System.out.println(name1.equals(name2));//only compares values

        //printing specific character by specifying index
        //System.out.println(name1.charAt(0));


//        System.out.println(56);
//        System.out.println(new int[]{1,2,3,4});

        //Using Arrays.toString() - overriding original toString Method
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));

//        String name = null;
//        System.out.println(name);

        Integer num = new Integer(56);
        System.out.println(num.toString());


    }
}
