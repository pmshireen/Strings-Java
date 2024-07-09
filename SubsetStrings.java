package Strings;
//https://www.javatpoint.com/java-program-to-find-all-subsets-of-a-string
public class SubsetStrings {

    public static void main(String[] args) {
        String str1 = "FUN";
        subsetOfStrings(str1);

    }
    public static void subsetOfStrings(String str){
        int len = str.length();
        int temp = 0;
        String arr[] = new String[len*(len+1)/2];
        for(int i = 0;i<len;i++){
            for(int j = i;j<len;j++){
                arr[temp] = str.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("All subsets of a String");
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
