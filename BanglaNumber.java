import java.util.*;

/*  kuti : 1千萬(10000000), lakh: 10萬(100000), hajar: 1000, shata: 100 */
public class BanglaNumber {
    public static void Bangla(long num){
        while (num > 0) {
            if (num >= 10000000) {
                System.out.print(" " + (num / 10000000) + " kuti");
                num %= 10000000;
                continue;
            }
            if(num>=100000 && num<10000000){
                System.out.print(" " + (num/100000) + " lakh");
                num %= 100000;
                continue;
            }
            if (num >= 1000 && num < 100000) {
                System.out.print(" " + (num / 1000) + " hajar");
                num %= 1000;
                continue;
            }
            if (num >= 100 && num < 1000) {
                System.out.print(" " + (num / 100) + " shata");
                num %= 100;
                continue;
            } else {
                System.out.print(" "+ num );
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long num = sc.nextLong();
            int N = 1;
            System.out.printf("%4d.", N);
            if (num == 0) {
                System.out.print(" 0");
            } else if (num >= 10000000) {
                Bangla(num / 10000000);
                System.out.print(" kuti");
                Bangla(num % 10000000);
            } else {
                Bangla(num);
            }
            System.out.println(" ");
            N++;
        }
        sc.close();
    }
}
