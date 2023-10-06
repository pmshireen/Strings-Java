package Strings;

//To toggle the case of every character of a string.
//if the input string is “ApPLe”, the output should be “aPplE”.
//we cannot make changes to the same string as it is immutable.
//So, we have to return a new String.
//The lowercase ASCII characters differ from the uppercase ASCII characters by 32.
//This means ‘a’ - 32 = ‘A’.

import java.util.Scanner;

public class CASES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        StringBuilder builder = new StringBuilder("");

        String ans = Transform(str,builder);
        System.out.println(ans);


        //System.out.println((char)('a' - 32));  //A
        //System.out.println((char)('B' + 32));  //b
    }

    static String Transform(String str,StringBuilder builder) {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i); //current character
            if(ch >='A' && ch <= 'Z') {

                builder.append((char)(ch + 32));
            }
            else if(ch >='a' && ch<='z') {

                builder.append((char)(ch - 32));
            }
            else {
                builder.append(ch);
            }

        }
        String result  = builder.toString();
        return result;

    }
}
