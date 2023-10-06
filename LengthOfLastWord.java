package Strings;
//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        int count = lastWordLength(str);
        System.out.println(count);

    }
    public static int lastWordLength(String s) {
        String newstr = s.trim();
        s=s.trim();
        int count=0;
        int i = s.length()-1;
        while(i >= 0 && newstr.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}
