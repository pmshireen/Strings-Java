package Strings;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstOccurenceString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "uiouo";
        int ans = firstOccString(haystack,needle);
        System.out.println(ans);

    }

    public static int firstOccString(String haystack ,String needle){
        if(haystack.length() == 0 || needle.length()== 0){
            return 11;
        }
        int res = 0;
        for(int i = 0;i<haystack.length();i++){
            char hay = haystack.charAt(i);
            for(int j = 0;j<needle.length();j++){
                char ned = needle.charAt(j);
                if(hay == ned){
                    res =  0;
                }
                else{
                    res = -1;
                }
            }
        }
        return  res;
    }
}
