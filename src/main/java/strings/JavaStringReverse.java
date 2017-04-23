//Java String Reverse - Challenge

package strings;


import java.util.Scanner;

public class JavaStringReverse {

    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        printIsPalindrome(A);
    }

    private static void printIsPalindrome(String a) {
        if(isPalindrome(a)){
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }

    private static boolean isPalindrome(String word){
        return new StringBuffer(word).reverse().toString().equals(word);
    }

}
