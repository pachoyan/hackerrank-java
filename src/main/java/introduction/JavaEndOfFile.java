//Java End-Of-File - Challenge

package introduction;


import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        while (sc.hasNext()) {
            String text = sc.nextLine();
            System.out.println(cont + " " + text);
            cont++;
        }
    }
}
