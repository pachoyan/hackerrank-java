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

            System.out.print(printOutputCase(a, b, n) + getBreakLineIfIsNotLastPos(i, t - 1));
        }
        in.close();
    }

    public static String printOutputCase(int a, int b, int n) {
        String line = "";
        for (int i = 0; i < n; i++) {
            line += a + getAllBValuesSum(i, b) + getSpaceIfIsNotLastPos(i, n - 1);
        }
        return line;
    }

    private static int getAllBValuesSum(int i, int b) {
        int val = 0;
        for (int j = 0; j <= i; j++) {
            val += (int) Math.pow(2, j) * b;
        }
        return val;
    }

    private static String getBreakLineIfIsNotLastPos(int i, int lastPos) {
        return i == lastPos ? "" : "\n";
    }

    private static String getSpaceIfIsNotLastPos(int i, int lastPos) {
        return i == lastPos ? "" : " ";
    }


}
