package dp;

import java.util.Scanner;

public class DP_1149 {
    static Scanner scanner = new Scanner(System.in);
    static int N, sum[][], a[][];

    public static void main(String[] args) {
        N = scanner.nextInt();
        a = new int[1001][3];
        sum = new int[1001][3];
        insert();
        for(int i=1; i<=N; i++) {
            sum[i][0] = cal(sum[i-1][1], sum[i-1][2]) + a[i][0];
            sum[i][1] = cal(sum[i-1][0], sum[i-1][2]) + a[i][1];
            sum[i][2] = cal(sum[i-1][0], sum[i-1][1]) + a[i][2];
        }
        System.out.println(cal(cal(sum[N][0], sum[N][1]), sum[N][2]));
    }



    public static void insert() {
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 3; j++) a[i][j] = scanner.nextInt();
        }
    }

    public static int cal(int x, int y) {
        return (x < y) ? x : y;
    }
}
