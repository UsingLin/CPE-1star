import java.util.*;

public class YouCanSay11 {

    public static void multiple(String n) {
        int odd = 0, even = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (i % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
        }

        //judge判斷問題(Math.abs)
        if (Math.abs(odd - even) % 11 == 0) {       //取絕對值
            System.out.println(n + " is a multiple of 11.");
        } else {
            System.out.println(n + " is not a multiple of 11.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String n = sc.next();
            if (n.equals("0")){break;}
            multiple(n);
        }
    }
}
