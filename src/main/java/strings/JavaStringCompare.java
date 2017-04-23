//Java String Compare - Challenge

package strings;


import java.util.Scanner;

public class JavaStringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int substringLength = sc.nextInt();

        printSmallestAndGreatest(txt, substringLength);
    }

    private static void printSmallestAndGreatest(String txt, int substringLength) {
        System.out.println(getSmallest(txt, substringLength));
        System.out.println(getGreatest(txt, substringLength));
    }

    private static String getSmallest(String txt, int substringLength) {
        int forLength = (txt.length() - substringLength) + 1;
        String smallest = txt.substring(0, substringLength);
        for (int i = 0; i < forLength; i++) {
            String actualSubstring = txt.substring(i, (i + substringLength));
            smallest = getSmallest(smallest, actualSubstring);
        }
        return smallest;
    }

    private static String getGreatest(String txt, int substringLength) {
        int forLength = (txt.length() - substringLength) + 1;
        String greatest = txt.substring(0, substringLength);
        for (int i = 0; i < forLength; i++) {
            String actualSubstring = txt.substring(i, (i + substringLength));
            greatest = getGreatest(greatest, actualSubstring);
        }
        return greatest;
    }

    private static String getSmallest(String smallest, String actualSubstring) {
        return actualSubstring.compareTo(smallest) < 0 ? actualSubstring : smallest;
    }

    private static String getGreatest(String greatest, String actualSubstring) {
        return actualSubstring.compareTo(greatest) > 0 ? actualSubstring : greatest;
    }

}
