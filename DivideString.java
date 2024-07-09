package Strings;

public class DivideString {
    public static void main(String[] args) {
        String str1 = "aabb";
        int n = 2;
        boolean ans = divideNParts(str1,n);
        System.out.println(ans);
    }

    public static boolean divideNParts(String str,int n){
        String[] finalString = new String[n];
        boolean res = true;
        int temp = 0;
        str = str.toLowerCase();

        int check = str.length()/n;

        if(str.length()%n  != 0){
            res = false;
        }
        else{
            for(int i = 0;i<str.length(); i = i+check){
                String part = str.substring(i,i+check);
                finalString[temp] = part;
                temp++;
            }
        }
        for(int i = 0;i < finalString.length;i++){
            System.out.println(finalString[i]);
        }
        return  res;
    }
}




// Program to divide Strings based on n value

//public class Main {
//    public static void main(String[] args)
//    {
//
//        String str = "aabb";
//        int len = str.length();
//        int n = 2;
//        int temp = 0, chars = len/n;
//
//        String[] equalStr = new String [n];
//
//        if(len % n != 0) {
//            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
//        }
//        else
//        {
//            for(int i = 0; i < len; i = i+chars) {
//                String part = str.substring(i, i+chars);
//                equalStr[temp] = part;
//                temp++;
//            }
//
//            System.out.println(n + " equal parts of given string are ");
//            for(int i = 0; i < equalStr.length; i++) {
//                System.out.println(equalStr[i]);
//            }
//        }
//    }
//}
//
//
