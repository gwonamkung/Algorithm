package dp.BOJ_1520_dfs_dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n, m, map[][], dp[][], cnt;
    private static int[] newX = {-1, 0, 1, 0};
    private static int[] newY = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        System.out.println(dfs(1, 1));
    }

    public static int dfs(int x, int y) {
        if (x == n && y == m) return 1;

        if (dp[x][y] != -1) return dp[x][y];

        dp[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = newX[i] + x;
            int ny = newY[i] + y;

            if (1 <= nx && nx <= n && 1 <= ny && ny <= m) {
                if (map[x][y] > map[nx][ny]) dp[x][y] += dfs(nx, ny);
            }
        }
        return dp[x][y];
    }
}