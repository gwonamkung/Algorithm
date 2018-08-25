package datastructure.queue.BOJ_1966;

import java.util.*;

public class Main {
    static class Node {
        int data;
        boolean bool;

        public Node(int a) {
            this(a, false);
        }

        public Node(int a, boolean b) {
            this.data = a;
            this.bool = b;
        }
    }

    public static Queue<Node> queue = new LinkedList<>();
    public static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            n = sc.nextInt();
            int target = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Node node;
                int element = sc.nextInt();
                if (i == target) node = new Node(element, true);
                else node = new Node(element);
                queue.add(node);
            }
            target = get(target);
            System.out.println(m(target));
        }
    }

    public static int m(int t) {
        boolean[] bResult = new boolean[n];
        int max = findMax(queue);
        int i = 0;
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            int v = n.data;
            boolean b = n.bool;
            if (v == max) {
                result.add(v);
                if (b == true) bResult[i] = true;
                i++;
                max = findMax(queue);
            } else queue.add(n);
        }
        for (int j = 0; j < result.size(); j++) {
            if (result.get(j) == t && bResult[j] == true) answer = j + 1;
        }
        return answer;
    }

    public static int findMax(Queue<Node> queue) {
        int max = 0;
        for (Node items : queue) max = Math.max(items.data, max);
        return max;
    }

    public static int get(int index) {
        Queue<Node> temp = new LinkedList<>(queue);
        for (int i = 0; i < index; i++) temp.poll();
        return temp.peek().data;
    }
}
