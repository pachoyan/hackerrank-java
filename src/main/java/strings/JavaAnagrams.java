//Java Anagrams - Challenge

package strings;


import java.util.Scanner;

public class JavaAnagrams {

    private static boolean isAnagram(String a, String b) {
        //TODO
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
