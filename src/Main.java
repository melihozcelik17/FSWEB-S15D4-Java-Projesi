import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        LinkedList<Character> stack=new LinkedList<>();
        StringBuilder noPunctionString=new StringBuilder();
        String lowerCase=text.toLowerCase();

        for( int i = 0 ; i<lowerCase.length(); i ++){
            char c=lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z' ) {
                noPunctionString.append(c);
                //noPunctionString.insert();
                stack.push(c);

            }
        }

        return false;
    }


    public static boolean checkForPalindormeFIFO(String text) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder queue = new StringBuilder();

        String lowerCase = text.toLowerCase(Locale.ENGLISH);
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.append(c);
                stack.push(c);

            }
        }

        return false;
    }
        public String convertDecimalToBinary(int num){
        final int base=2;
            Stack digits = new Stack();
            while (num>0){
                digits.push(num % 2);
                num= num / 2 ;
            }
            String bits = "";
            while (!digits.isEmpty()){
                bits+=digits.pop();
            }
            return bits;
        }
}