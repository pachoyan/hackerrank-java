//Java Static Initializer Block - Challenge

package introduction;


import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static int H;
    private static int B;
    private static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        B = sc.nextInt();
        flag = H > 0 && B > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main
}
