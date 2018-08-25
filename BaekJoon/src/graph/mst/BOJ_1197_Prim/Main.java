package graph.mst.BOJ_1197_Prim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int from;
        int to;
        int weight;

        public Node(int to, int weight) {
            this(0, to, weight);
        }

        public Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node n) {
            return weight > n.weight ? 1 : -1;
        }
    }

    static ArrayList<Node>[] map;
    static Queue<Node> PQ = new PriorityQueue<>();
    static int[] key;
    static int[] edge_end;
    static boolean[] added;
    static int V;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        map = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) map[i] = new ArrayList<>();

        for (int i = 1; i <= E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            map[x].add(new Node(y, weight));
            map[y].add(new Node(x, weight));
        }

        added = new boolean[V + 1];
        key = new int[V + 1];
        edge_end = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            key[i] = Integer.MAX_VALUE;
            edge_end[i] = 1;
        }

        prim(1);

        br.close();
    }

    private static void prim(int start) {
        PQ.add(new Node(0, start, 0));

        key[start] = 0;
        edge_end[start] = 0;

        int cnt = 1;
        int sum = 0;

        while(cnt <= V) {
            Node pq_node = PQ.poll();
            int x = pq_node.to;
            if(added[x]) continue;
            added[x] = true;
            sum += pq_node.weight;

            //update key.
            for (int i = 0; i < map[x].size(); i++) {
                Node node = map[x].get(i);
                if (!added[node.to]) updateKey(node, x, node.to);
            }
            cnt++;
        }
        System.out.println(sum);
    }

    private static void updateKey(Node node, int from, int target) {
        if (key[target] > node.weight) {
            key[target] = node.weight;
            edge_end[target] = from;
            PQ.add(new Node(from, target, node.weight));
        }
    }
}