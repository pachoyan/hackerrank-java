//Java Regex  - Challenge

package strings;


import java.util.Scanner;

public class JavaRegex {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex {

        public static final String IP_PART = "\\d{1,2}|(0|1)\\d\\d|2[0-4][0-9]|25[0-5]";
        public String pattern = "^(" + IP_PART + ")." +
                "(" + IP_PART + ")." +
                "(" + IP_PART + ")." +
                "(" + IP_PART + ")$";
    }
}
