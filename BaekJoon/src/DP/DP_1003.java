package DP;

import java.io.*;

public class DP_1003 {
    public static int memo[][] = new int[42][2];
    public static int value;
    public static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.valueOf(br.readLine());
        fivo();
        for (int i = 0; i < N; i++) {
            value = Integer.valueOf(br.readLine());

            bw.write(memo[value][0] + " " + memo[value][1] + "\n");
        }
        br.close();
        bw.close();
    }

    public static void fivo() {
        memo[0][0] = 1;
        memo[0][1] = 0;
        memo[1][1] = 1;
        memo[1][0] = 0;
        for (int i=2; i<=40; i++) {
            memo[i][0] = memo[i-1][0] + memo[i-2][0];
            memo[i][1] = memo[i-1][1] + memo[i-2][1];
        }
    }
}