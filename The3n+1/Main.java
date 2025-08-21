import java.util.Scanner;

public class Main {

    // 計算單一數字的 cycle length
    public static int cycleLength(int n) {
        int count = 1; // 包含 n 本身
        while (n != 1) {
            if ((n & 1) == 1) { // 判斷奇數，等同於 n % 2 == 1
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 一直讀取直到 EOF
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int lo = Math.min(i, j);
            int hi = Math.max(i, j);

            int maxCycle = 0;
            for (int n = lo; n <= hi; n++) {
                int length = cycleLength(n);
                if (length > maxCycle) {
                    maxCycle = length;
                }
            }

            // 輸出格式要保持輸入的 i j 順序
            System.out.println(i + " " + j + " " + maxCycle);
        }

        sc.close();
    }
}