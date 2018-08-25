package graph.dijkstra_algorithm.BOJ_1753;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static class Node {
        int num;
        int time;

        private Node(int num, int time) {
            this.num = num;
            this.time = time;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());

        ArrayList<Node>[] map = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) map[i] = new ArrayList<>();

        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())].add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Queue<Node> q = new PriorityQueue<>(10, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.time > o2.time) return 1;
                else if (o1.time < o2.time) return -1;
                else return 0;
            }
        });
        q.add(new Node(start, 0));

        int[] n_time = new int[V + 1];
        final int MAX = 999999999;
        Arrays.fill(n_time, MAX);
        n_time[start] = 0;

        boolean[] b = new boolean[V + 1];

        while (!q.isEmpty()) {
            int x = q.poll().num;
            if (b[x] == true) continue;
            else {
                b[x] = true;
                for (int y = 0; y < map[x].size(); y++) {
                    Node n = map[x].get(y);
                    if (n_time[n.num] > n_time[x] + n.time) {
                        n_time[n.num] = n_time[x] + n.time;
                        if (!b[n.num]) q.add(new Node(n.num, n_time[n.num]));
                    }
                }
            }
        }
        for (int i = 1; i <= V; i++) {
            if (n_time[i] == MAX) System.out.println("INF");
            else System.out.println(n_time[i]);
        }
    }
}