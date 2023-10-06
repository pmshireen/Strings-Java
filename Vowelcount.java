package Strings;

public class Vowelcount {
    public static void main(String[] args) {
       String str = "kaeiouj";
       int ans = findcount(str);
        System.out.println(ans);
    }
    static int findcount(String str){
        int len = str.length();
        int vowels=0;
        int  consonants=0;
        for(int i = 0;i<len;i++){
            char c =  str.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o' || c == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        return vowels;
    }
}
