package Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        skip("", "baccadanaff");       //processed is initially empty
       // p = "" /up = "baccadanaff"        //unprocessed contains the string

        System.out.println(skipReturn("baccadanaff"));

        System.out.println(skipApple("Murshidhaappleshireen"));

        System.out.println(skipAppNotApple("appshireen"));

    }


    //Skipping a character
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }


    static String skipReturn(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipReturn(up.substring(1));
        }
        else{
            return ch + skipReturn(up.substring(1));
        }
    }


    //Skipping a entire string
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
