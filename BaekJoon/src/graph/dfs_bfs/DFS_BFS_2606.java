package graph.dfs_bfs;

import java.util.Scanner;

public class DFS_BFS_2606 {
    static int N;
    static int[][] arr;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int j = 1; j <= M; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = arr[y][x] = 1;
        }

        DFS(1);
        System.out.println(cnt);
    }

    public static void DFS(int start) {
        visited[start] = true;
        for (int j = 1; j <= N; j++) {
            if (arr[start][j] == 1 && visited[j] == false) {
                cnt++;
                DFS(j);
            }
        }
    }
}