package Strings;


import java.util.Arrays;

//The method valueOf() will convert the entire array into a string.

//https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
public class SortStringsGFG {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        char[] ans = sortStrings(arr);
        System.out.println(String.valueOf(ans));

    }
    public static char[] sortStrings(char[] arr){
        char temp;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
