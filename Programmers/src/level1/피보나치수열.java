package level1;

import java.util.Arrays;

public class 피보나치수열 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) System.out.println(i + ": " + solution(i));
    }

    public static int solution(int n) {
        int[] r = new int[n + 1];
        r[0] = 0;
        r[1] = 1;
        for (int i = 2; i <= n; i++) {
            r[i] = r[i - 1] + r[i - 2];
        }
        System.out.println("r[n]: " + r[n]);
        int[] d = Arrays.copyOf(r, r.length);
        System.out.println("d[n]: " + d[n]);
        for (int i = 0; i <= n; i++) {
            d[i] %= 1234567;
        }
        return d[n];
    }
}
