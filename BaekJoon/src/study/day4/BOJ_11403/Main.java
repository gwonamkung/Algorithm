package study.day4.BOJ_11403;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Queue<Integer> q = new LinkedList<>();
    private static int n, map[][], result[][];
    private static boolean check[][];

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());
        map = new int[n + 1][n + 1];
        result = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int j = 1; j <= n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        bfs();
//        for (int k = 1; k<=n; k++) {
//            for (int i=1; i<=n; i++) {
//                for (int j=1; j<=n; j++) if (map[i][k] == 1 && map[k][j] == 1) map[i][j] = 1;
//            }
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) sb.append(map[i][j] + " ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void bfs() {
        for (int i = 1; i <= n; i++) {
            q.add(i);
            List<Integer> list = new ArrayList<>();
            check = new boolean[n + 1][n + 1];

            while (!q.isEmpty()) {
                int x = q.poll();
                for (int y = 1; y <= n; y++) {
                    if (map[x][y] == 1 && !check[x][y]) {
                        q.add(y);
                        list.add(y);
                        check[x][y] = true;
                    }
                }
            }
            for (int j = 0; j < list.size(); j++) result[i][list.get(j)] = 1;
        }
    }
}