package Strings;
//https://www.javatpoint.com/java-program-to-find-the-longest-repeating-sequence-in-a-string
public class LongestSequence {
    public static void main(String[] args) {
        String str = "abaab";
        String lrs="";
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Checks for the largest common factors in every substring
                String x = longestRepeatingSequence(str.substring(i,n),str.substring(j,n));
                System.out.println("x is "+x);
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) lrs=x;
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);
    }



    public static String longestRepeatingSequence(String s ,String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                System.out.println("Inside  "+s);
                return s.substring(0,i);

            }
        }
        System.out.println("Outside  "+s);
        return s.substring(0,n);
    }
}
