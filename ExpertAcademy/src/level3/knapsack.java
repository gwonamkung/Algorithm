package level3;

import java.util.*;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int n = sc.nextInt();
            int v = sc.nextInt();
            int V[] = new int[n];
            int C[] = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                V[i] = sc.nextInt();
                C[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (V[i] + V[j] <= v) {
                        max = Math.max(max, C[i] + C[j]);
                    }
                }
            }
            System.out.println("#" + tcase + " " + max);
        }
        sc.close();
    }
}
