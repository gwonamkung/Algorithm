package graph.topological.BOJ_1766_PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Queue<Integer>[] ins;
    private static Queue<Integer> result_q;
    private static int[] indegree;

    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ins = new Queue[N + 1];
        indegree = new int[N + 1];
        for (int i = 1; i <= N; i++) ins[i] = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ins[x].add(y);
            indegree[y]++;
        }
        question_sort();
    }

    public static void question_sort() {
        result_q = new PriorityQueue<>();

        for (int j = 1; j <= N; j++) if (indegree[j] == 0) result_q.add(j);

        for (int i = 1; i <= N; i++) {
            System.out.print(result_q.peek() + " ");
            int x = result_q.poll();

            while (!ins[x].isEmpty()) {
                int y = ins[x].poll();
                if (--indegree[y] == 0) result_q.add(y);
            }
        }
    }
}
