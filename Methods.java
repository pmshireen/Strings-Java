package Strings;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Murshidha Shireen";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase(Locale.ROOT));//creates a new Object

        System.out.println(name);//original object does not get modified
        System.out.println(name.indexOf('S'));

        System.out.println("   Murshi  ".strip());//extra spaces are removed

        System.out.println(Arrays.toString(name.split(" ")));

    }
}
