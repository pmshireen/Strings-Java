package Strings;
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
public class IpAddress {
    public static void main(String[] args) {
          String address = "1.1.1.1";
          //String ans = defangIPaddr(address);
          String ans = GeberateDefangIP(address);
          System.out.println(ans);
    }


        public static String defangIPaddr(String address) {
            char ch;
            if(address == null ){
                return null;
            }
            for(int i = 0;i<address.length();i++){
                ch = address.charAt(i);
                if(ch == '.')
                    return address.replace(".","[.]");
            }
            return address.replace(".","[.]");
        }

   public  static String GeberateDefangIP(String address)
    {
        String defangIP = "";

        // Loop to iterate over the
        // characters of the string
        for(int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(c == '.')
            {
                defangIP += "[.]";
            }
            else
            {
                defangIP += c;
            }
        }
        return defangIP;
    }

}

