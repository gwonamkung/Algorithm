package graph.mst;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MST_1197_Kruskal {
    static class Node implements Comparable<Node> {
        int x;
        int y;
        int weight;

        public Node(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

        public int compareTo(Node n) {
            return weight > n.weight ? 1 : -1;
        }
    }

    static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        Queue<Node> PQ = new PriorityQueue<>();

        parent = new int[V + 1];
        for (int i = 1; i <= V; i++) parent[i] = i;

        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            PQ.add(new Node(x, y, weight));
        }

        br.close();

        int total_cost = 0;
        while (V > 1) {
            Node node = PQ.poll();
            if(union(node.x, node.y)) {
                total_cost += node.weight;
                V--;
            }
        }
        System.out.println(total_cost);
    }

    private static int getParent(int v) {
        if (parent[v] == v) return v;
        else return parent[v] = getParent(parent[v]);
    }

    private static boolean union(int x, int y) {
        int x_parent = getParent(x);
        int y_parent = getParent(y);

        if(x_parent != y_parent) {
            parent[x_parent] = y_parent;
            return true;
        }
        return false;
    }
}