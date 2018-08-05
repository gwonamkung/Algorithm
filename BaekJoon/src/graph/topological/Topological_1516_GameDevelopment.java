package graph.topological;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Topological_1516_GameDevelopment {
    private static Queue<Integer>[] ins;
    private static int[] indegree;
    private static int[] result;
    private static int[] time;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ins = new Queue[N + 1];
        indegree = new int[N + 1];
        time = new int[N + 1];

        for (int i = 0; i < N + 1; i++) ins[i] = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            int t = sc.nextInt();
            time[i] = t;

            while (true) {
                int num = sc.nextInt();
                if (num == -1) break;
                ins[num].add(i);
                indegree[i]++;
            }
        }
        solution();
    }

    private static void solution() {
        result = new int[N + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                result[i] = time[i];
                q.add(i);
            }
        }

        for (int i = 1; i <= N - 1; i++) {
            int v = q.poll();
            while (!ins[v].isEmpty()) {
                int y = ins[v].poll();
                result[y] = Math.max(result[y], result[v] + time[y]);
                indegree[y]--;
                if (indegree[y] == 0) q.add(y);
            }
        }
        for (int i=1; i<=N; i++) System.out.println(result[i]);
    }
}