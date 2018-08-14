package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 농작물수확하기_2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t_case = Integer.parseInt(br.readLine());

        for (int t = 1; t <= t_case; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) map[i][j] = str.charAt(j) - 48;
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (i <= N / 2) {
                    for (int j = N / 2 - i; j <= N / 2 + i; j++) sum += map[i][j];
                } else {
                    for (int j = i - (N / 2); j <= (((-1) * i) + (3 * (N / 2))); j++) sum += map[i][j];
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}