//Java String Tokens - Challenge

package strings;


import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

    private static final String DELIM = "[\\s'!?_.@]+";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(s, DELIM);
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
        scan.close();
    }
}
