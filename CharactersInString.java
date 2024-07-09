package Strings;

public class CharactersInString {

    public static void main(String[] args) {
        String str = "Murshidha";
        countCharaters(str);
    }

    public static void countCharaters(String str){
        int len = str.length();
        int count = 0;
        for(int i = 0;i<len;i++){

//            if (!Character.isLetter(str.charAt(i))) {
//                count++;
//            }

            if(str.charAt(i) !=' '){ // string means compare it with the Space
               count++;
            }
        }
        System.out.println(count);

    }
}
