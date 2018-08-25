package dp.BOJ_1005_acmcraft;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Queue<Integer>[] ins;
    private static int[] indegree;
    private static int[] result;
    private static int[] time;
    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t_case = sc.nextInt();
        for (int i=1; i<= t_case; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
            ins = new Queue[N + 1];
            indegree = new int[N + 1];
            time = new int[N + 1];

            for (int j = 0; j < N + 1; j++) ins[j] = new LinkedList<>();

            for(int j=1; j<=N; j++) time[j] = sc.nextInt();

            for (int j=0; j<M; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                ins[x].add(y);
                indegree[y]++;
            }
            solution(sc.nextInt());
        }
    }

    private static void solution(int target) {
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
        System.out.println(result[target]);
    }
}