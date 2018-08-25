package graph.bfs.BOJ_2178;

import java.util.*;

public class Main {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] arr;
    private static int N, M;

    static int[] movex = {0, 0, -1, 1}; // 위, 아래, 왼, 오
    static int[] movey = {-1, 1, 0, 0}; // 위, 아래, 왼, 오

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N + 2][M + 2];

        for (int i = 1; i <= N; i++) {
            String str = sc.next();
            for (int j = 1; j <= M; j++) arr[i][j] = str.charAt(j - 1) - 48;
        }

        bfs(1, 1);
        System.out.println(arr[N][M]);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    private static void bfs(int x, int y) {
        boolean[][] visited = new boolean[N + 1][M + 1];
        Queue<Node> q = new LinkedList<Node>(); // Node와 큐를 만들어놓고
        q.add(new Node(x, y)); // 큐에다가 (x, y)를 집어 넣는다.

        //미로 탐색 시작.
        while (!q.isEmpty()) { // 큐가 빌 때까지 탐색
            Node n = q.poll(); // 큐에 들어있는 걸 뽑아오고

            // 뽑아온 x, y를 기준으로 위, 아래, 왼쪽, 오른쪽으로 탐색
            for (int i = 0; i < 4; i++) {
                int nextx = n.x + movex[i];
                int nexty = n.y + movey[i];

                // 다음 칸이 미로밖이라면 이번 i 건너뛰기
                if (nextx < 1 || nexty < 1 || nextx >= N + 1 || nexty >= M + 1) continue;

                // 다음 칸이 이미 탐색했던 칸이라면 이번 i 건너뛰기
                if (visited[nextx][nexty]) continue;

                //다음 칸이 벽이라면 이번 i 건너뛰기
                if (arr[nextx][nexty] == 0) continue;

                q.add(new Node(nextx, nexty)); //위 조건을 모두 피했다면, 다음 칸을 큐에 넣고
                arr[nextx][nexty] = arr[n.x][n.y] + 1; //다음 칸의 숫자를 +1
                visited[nextx][nexty] = true; //다음 칸에 방문했다는 표시 해주기.
            }
        }
    }
}