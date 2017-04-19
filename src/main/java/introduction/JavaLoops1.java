//Java Loops I - Challenge

package introduction;


import java.util.Scanner;

public class JavaLoops1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMultiples(sc.nextInt());
    }


    public static void printMultiples(int num){
        for(int i = 1; i <= 10; i++)
            System.out.println(getMultipleLine(num, i));
    }

    public static String getMultipleLine(int num, int multiple) {
        return num + " x " + multiple + " = " + (num * multiple);
    }
}
