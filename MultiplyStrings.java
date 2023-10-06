package Strings;
//https://leetcode.com/problems/multiply-strings/         answer not found
//In Java, we can use Integer.valueOf() and
//Integer.parseInt() to convert a string to an integer.
public class MultiplyStrings {
    public static void main(String[] args) {
        String str1 = "123456789";
        String str2 = "987654321";
        String ans = multiply1(str1, str2);
        System.out.println(ans);
    }

    public static String multiply(String num1, String num2) {

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int num = n1 * n2;

        String str = Integer.toString(num);

        return str;
    }


    public static String multiply1(String num1, String num2)
    {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int[] d = new int[n1.length() + n2.length()];

        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                d[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        String result = "";

        for (int i = 0; i < d.length; i++) {
            int digit = d[i] % 10;
            int carry = d[i] / 10;
            if (i + 1 < d.length) {
                d[i + 1] += carry;
            }
            result = (digit + "") + result;
        }

        int index = 0;
        while (index < result.length() - 1 && result.charAt(index) == '0') {
            index++;
        }
        return result.substring(index);

    }


}


