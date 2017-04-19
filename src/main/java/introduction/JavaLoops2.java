//Java Loops II - Challenge


package introduction;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            printOutputCase(a, b, n);
            boolean isLast = i == (t - 1);
            if(!isLast){
                System.out.println();
            }
        }
        in.close();
    }

    public static void printOutputCase(int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            int val = a;
            for (int j = 0; j <= i; j++) {
                val += (int) Math.pow(2, j) * b;
            }

            System.out.print(val);
            boolean isLastPos = i == (n - 1);
            if(!isLastPos) {
                System.out.print(" ");
            }

        }
    }
}
