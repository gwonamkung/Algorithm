package study.day7.SW_1803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    private static class Node {
        int num;
        long V;

        public Node(int num, long V) {
            this.num = num;
            this.V = V;
        }
    }

    private static ArrayList<Node> map[];
    private static int N, M;
    private static long dist[];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(in.readLine());

        for (int c = 1; c <= t; c++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            dist = new long[N + 1];
            Arrays.fill(dist, Long.MAX_VALUE);
            dist[start] = 0;

            map = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) map[i] = new ArrayList<>();

            for (int i = 1; i <= M; i++) {
                st = new StringTokenizer(in.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                map[x].add(new Node(y, v));
                map[y].add(new Node(x, v));
            }

            bfs(start);
            sb.append("#" + c + " " + dist[end] + "\n");
        }
        System.out.println(sb.toString());
        in.close();
    }

    private static void bfs(int start) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(start, dist[start]));

        while (!q.isEmpty()) {
            Node x = q.poll();
            if (x.V > dist[x.num]) continue;

            for (int i = 0; i < map[x.num].size(); i++) {
                Node node = map[x.num].get(i);
                if (dist[node.num] > dist[x.num] + node.V) {
                    dist[node.num] = dist[x.num] + node.V;
                    q.add(new Node(node.num, dist[node.num]));
                }
            }
        }
    }
}