//Java Data Types- Challenge

package introduction;


import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                printFittedDataTypes(x);
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    private static void printFittedDataTypes(long x) {
        if (canBeByte(x))
            System.out.println("* byte");
        if (canBeShort(x))
            System.out.println("* short");
        if (canBeInt(x))
            System.out.println("* int");
        //Long always be fitted if there aren't an exception
        System.out.println("* long");
    }

    private static boolean canBeByte(long x) {
        return x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE;
    }

    private static boolean canBeShort(long x) {
        return x >= Short.MIN_VALUE && x <= Short.MAX_VALUE;
    }

    private static boolean canBeInt(long x) {
        return x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE;
    }

}
