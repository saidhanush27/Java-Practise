public class ReverseaString {
    public static void main(String[] args) {
        String str = "abcd";
        String reversestr= "";
        char ch;
        System.out.println(" the original string is :" + str );
        for (int i = 0; i < str.length(); i++) {
        ch = str.charAt(i);
        reversestr = ch +  reversestr;
        }
        
        System.out.println("The Reversed string is :" + reversestr);
    }
}
