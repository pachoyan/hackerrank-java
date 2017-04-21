//Java Output Formatting - Challenge

package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    private static final int LENGTH_TO_INIT_NUM_POS = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String txt = sc.next();
            int num = sc.nextInt();
            System.out.println(getTextFormatted(txt, num));
        }
        System.out.println("================================");
    }

    private static String getTextFormatted(String txt, int x) {
        return txt + getSpaces(txt.length()) + getNumberFormatted(x);
    }

    private static String getSpaces(int wordLength) {
        String spacesTxt = "";
        for(int i = 0; i < LENGTH_TO_INIT_NUM_POS - wordLength; i++){
            spacesTxt += " ";
        }
        return spacesTxt;
    }

    private static String getNumberFormatted(int x) {
        if (hasOneDigit(x)) {
            return "00" + x;
        } else if (hasTwoDigits(x)) {
            return "0" + x;
        } else {
            return String.valueOf(x);
        }
    }

    private static boolean hasTwoDigits(int x) {
        return x < 100 && x > 9;
    }

    private static boolean hasOneDigit(int x) {
        return x < 10;
    }

}
