package study.day11.SW_5521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    private static ArrayList<ArrayList<Integer>> list;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tcase = Integer.parseInt(in.readLine());

        for (int t = 1; t <= tcase; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            list = new ArrayList<>();

            for (int i = 0; i <= N; i++) list.add(new ArrayList<>());

            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                list.get(a).add(b);
                list.get(b).add(a);
            }

            sb.append("#" + t + " " + solve(1, 1) + "\n");
        }

        System.out.println(sb.toString());
        in.close();
    }

    private static int solve(int start, int dist) {
        boolean[] visited = new boolean[N + 1];
        Queue<node> q = new LinkedList<>();
        visited[start] = true;
        q.add(new node(start, dist));

        int answer = -1;

        while (!q.isEmpty()) {
            node n = q.poll();
            if (n.dist > 3) break;
            answer++;

            for (int i = 0; i < list.get(n.num).size(); i++) {
                int friend = list.get(n.num).get(i);

                if (visited[friend]) continue;

                q.add(new node(friend, n.dist + 1));
                visited[friend] = true;
            }
        }

        return answer;
    }

    private static class node {
        int num;
        int dist;

        private node(int num, int dist) {
            this.num = num;
            this.dist = dist;
        }
    }
}