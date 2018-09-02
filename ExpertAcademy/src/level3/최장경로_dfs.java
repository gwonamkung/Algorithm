package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최장경로_dfs {
    private static boolean[] visited;
    private static int[][] map;
    private static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t_case = Integer.parseInt(br.readLine());

        for (int t = 1; t <= t_case; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            map = new int[N + 1][N + 1];
            visited = new boolean[N + 1];

//            for (int i = 1; i <= M; i++) {
//                st = new StringTokenizer(br.readLine());
//                int x = Integer.parseInt(st.nextToken());
//                int y = Integer.parseInt(st.nextToken());
//                map[x][y] = map[y][x] = 1;
//            }

            max = 0;
            for (int i = 1; i <= N; i++) dfs(i, 1);

            System.out.println("#" + t + " " + max);
        }
    }

    private static void dfs(int start, int len) {
        max = Math.max(max, len);
        visited[start] = true;

        for (int i = 1; i <= map[start].length - 1; i++) {
            if (map[start][i] == 1 && visited[i] == false) dfs(i, len + 1);
        }
        visited[start] = false;
    }
}
