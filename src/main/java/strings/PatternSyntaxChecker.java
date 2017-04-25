//Pattern Syntax Checker - Challenge

package strings;


import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

    private static final String VALID = "Valid";
    private static final String INVALID = "Invalid";

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            printValidation(pattern);
            --testCases;
        }
    }

    private static void printValidation(String pattern) {
        if(isValidPattern(pattern))
            printValid();
        else
            printInvalid();
    }

    private static boolean isValidPattern(String pattern) {
        try{
            Pattern.compile(pattern);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    private static void printValid() {
        System.out.println(VALID);
    }

    private static void printInvalid() {
        System.out.println(INVALID);
    }
}

