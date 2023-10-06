package Strings;
//Input: s = "(abcd)"
//Output: "dcba"
//Input: s = "(u(love)i)"
//Output: "iloveu"
//Explanation: The substring "love" is reversed first, then the whole string is reversed.
//Input: s = "(ed(et(oc))el)"
//Output: "leetcode"
//Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
//**********INCOMPLETE****************
public class ReverseStrings {
    public static void main(String[] args) {
        String s = "abc";
        String ans = reverseParentheses(s);
        System.out.println(ans);
    }

    public static  String reverseParentheses(String s) {

        char ch;
        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {
            ch = s.charAt(i);
//            if(ch == ')' && ch == '('){
//
//            }
            str = ch + str;

        }
        return str;
    }
}

