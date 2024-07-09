package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "damam";
        boolean ans = checkAnagram(str1,str2);
        System.out.println(ans);

    }

    public static boolean checkAnagram(String str1,String str2){
        boolean res = false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!= str2.length()){
            return res;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2) == true){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
}
