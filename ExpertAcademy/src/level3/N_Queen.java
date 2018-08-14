package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_Queen {
    static int N, cnt;
    static boolean[][] check;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tcase = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tcase; t++) {
            N = Integer.parseInt(br.readLine());

            check = new boolean[N + 1][N + 1];
            cnt = 0;
            dfs(1);
            System.out.println("#" + t + " " + cnt);
        }
    }

    private static void dfs(int row) {
        if (row == N + 1) cnt++;
        else {
            for (int col = 1; col <= N; col++) {
                check[row][col] = true;
                if (check(row, col)) {
                    dfs(row + 1);
                }
                check[row][col] = false;
            }
        }
    }

    private static boolean check(int row, int col) {
        //세로
        for (int i = 1; i <= N; i++) {
            if (i != row) if (check[i][col]) return false;
        }

        //오른 상단 대각선
        for (int i = 1; i <= row - 1; i++) {
            if (col + i > N) break;
            if (check[row - i][col + i]) return false;
        }

        //왼 상단 대각선
        for (int i = 1; i <= row - 1; i++) {
            if (col - i < 1) break;
            if (check[row - i][col - i]) return false;
        }

        return true;
    }
}