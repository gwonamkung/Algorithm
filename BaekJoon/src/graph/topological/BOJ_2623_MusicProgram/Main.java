package graph.topological.BOJ_2623_MusicProgram;

import java.util.*;

public class Main {
    private static Queue<Integer>[] list;
    private static int[] indegree;
    private static Queue<Integer> q;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        list = new Queue[N + 1];
        indegree = new int[N + 1];

        for (int i = 1; i <= N; i++) list[i] = new LinkedList<>();

        for (int i = 1; i <= M; i++) {
            int t = sc.nextInt();
            int x = 0, y = 0, z = 0;

            for (int j = 0; j < t; j++) {
                if (x == 0) x = sc.nextInt();
                else if (y == 0) {
                    y = sc.nextInt();
                    list[x].add(y);
                    if (indegree[y] < N - 1) indegree[y]++;
                } else if (z == 0) {
                    z = sc.nextInt();
                    list[y].add(z);
                    if (indegree[z] < N - 1) indegree[z]++;
                } else {
                    y = z;
                    z = sc.nextInt();
                    list[y].add(z);
                    if (indegree[z] < N - 1) indegree[z]++;
                }
            }
        }
        topological_sort();
    }

    private static void topological_sort() {
        List<Integer> result = new ArrayList<>();
        q = new LinkedList<>();
        for (int i = 1; i <= N; i++) if (indegree[i] == 0) q.add(i);

        while (!q.isEmpty()) {
            int x = q.poll();
            result.add(x);
            while (!list[x].isEmpty()) {
                int y = list[x].poll();
                if (--indegree[y] == 0) q.add(y);
            }
        }
        if (result.size() < N) System.out.println("0");
        else for (int items : result) System.out.println(items);
    }
}
