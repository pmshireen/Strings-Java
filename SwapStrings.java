package Strings;

public class SwapStrings {
    public static void main(String[] args) {
         String str1= "Hello";
         String str2 = "World";
        System.out.println("Before swapping");
        System.out.println("str1- "+str1);
         System.out.println("str2- "+str2);


         swapSS(str1,str2);
        //tempSwap(str1,str2);
    }
    static void swapSS(String str1,String str2){


        str1 = str1+str2;//HelloWorld

        str2  = str1.substring(0, (str1.length() - str2.length()));

        str1= str1.substring(str2.length());

        System.out.println("str1 -"+str1);
        System.out.println("str2 -"+str2);

    }

    static void tempSwap(String str1,String str2){
        String temp;
        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1 -"+str1);
        System.out.println("str2 -"+str2);

    }
}
