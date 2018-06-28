package level2;

import java.util.Scanner;

public class 수도요금경쟁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();
            int calc1 = p * w;
            int calc2 = (w <= r) ? q : q + (w - r) * s;
            System.out.println("#" + tcase + " " + Math.min(calc1, calc2));
        }
    }
}
