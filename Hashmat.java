import java.util.*;

/*  Hahmat 士兵數量絕對不超過敵軍數量，反之，計算差值 */
public class Hashmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 用 Long(-2^63 ~ 2^63-1)
        while (sc.hasNextLong()) {
            long a1 = sc.nextLong();
            long a2 = sc.nextLong();

            System.out.println(Math.abs(a1-a2));
        }

        sc.close();
    }
}
