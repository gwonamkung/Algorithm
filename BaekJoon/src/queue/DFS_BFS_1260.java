package queue;

import java.util.*;

public class DFS_BFS_1260 {
    public static final int MAX = 1001;
    public static boolean[] Is_visited = new boolean[MAX];
    public static int[][] arr = new int[MAX][MAX];
    public static String result = "";
    public static int N = 0, M = 0, start = 0;

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
        Is_visited = new boolean[MAX];
        BFS(start);
        System.out.println(result);
    }

    public static void DFS(int x) {
        Is_visited[x] = true;
        result += x + " ";

        for (int i = 1; i <= N; i++) {
            if (arr[x][i] == 1 && Is_visited[i] == false) DFS(i);
        }
    }

    public static void BFS(int x) {
        Is_visited[x] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while (queue.iterator().hasNext()) {
            x = queue.poll();
            result += x + " ";
            for (int i = 0; i <= N; i++) {
                if (arr[x][i] == 1 && Is_visited[i] == false) {
                    Is_visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
