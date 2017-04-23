//Java Strings Introduction - Challenge

package strings;


import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        printSum(A, B);
        printYesOrNo(A, B);
        printFormattedString(A, B);

    }

    private static void printSum(String a, String b) {
        System.out.println(a.length() + b.length());
    }

    private static void printFormattedString(String a, String b) {
        System.out.println(firstLetterToUpperCase(a) + " " + firstLetterToUpperCase(b));
    }

    private static void printYesOrNo(String a, String b) {
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static String firstLetterToUpperCase(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }

}
