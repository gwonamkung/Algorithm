package queue;

import java.util.*;

public class DFS_BFS_1260 {
    public static final int MAX_COUNT = 1001;
    public static boolean[] is_visited = new boolean[MAX_COUNT];
    public static int[][] arr = new int[MAX_COUNT][MAX_COUNT];
    static String result = "";
    static int N = 0, M = 0, start = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        DFS(start);
        result += "\n";
        is_visited = new boolean[MAX_COUNT];
        BFS(start);
        System.out.println(result);
    }

    public static void DFS(int V) {
        is_visited[V] = true;
        result += V + " ";
        for (int i = 1; i <= N; i++) {
            if (arr[V][i] == 1 && is_visited[i] == false) DFS(i);
        }
    }

    public static void BFS(int V) {
        is_visited[V] = true;
        Queue<Integer> list = new LinkedList<>();
        list.add(V);
        while (!list.isEmpty()) {
            V = list.poll();
            result += V + " ";
            for (int i = 1; i <= N; i++) {
                if (arr[V][i] == 1 && is_visited[i] == false) {
                    is_visited[i] = true;
                    list.add(i);
                }
            }
        }
    }
}
