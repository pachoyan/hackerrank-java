//Java Anagrams - Challenge

package strings;


import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    private static boolean isAnagram(String a, String b) {
        String aSorted = getStringSorted(a);
        String bSorted =  getStringSorted(b);
        return aSorted.equals(bSorted);
    }

    private static String getStringSorted(String a) {
        char[] chars = a.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
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
