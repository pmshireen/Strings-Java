package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');      //195
        System.out.println("a" + "b");      //ab

        System.out.println('a' + 3);

        System.out.println((char)('a' + 3));
        System.out.println("Murshi"+new ArrayList<>());
        System.out.println("Murshi"+new Integer(56));

        //this will give error
      //  System.out.println(new ArrayList<>() + new Integer(56));

        String ans = new ArrayList<>() +""+ new Integer(56);
        System.out.println(ans);


        //if one of datatype is String ans will be String
        System.out.println("a" + 'b');


    }
}
