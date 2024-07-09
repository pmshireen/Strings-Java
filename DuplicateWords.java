package Strings;
//https://www.javatpoint.com/java-program-to-find-the-duplicate-words-in-a-string
public class DuplicateWords {

    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        int count;

        //Converts the string into lowercase
        string = string.toLowerCase();

        //Split the string into words using built-in function
        String words[] = string.split(" ");
//        System.out.println("Words after splitting");
//        for(int i = 0;i < words.length;i++){
//            System.out.println(words[i]);
//        }
        duplicateWordsInString(words);

    }
    public static  void duplicateWordsInString(String[] words) {
        for(int i = 0; i < words.length; i++) {
            int count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }


    }
}
