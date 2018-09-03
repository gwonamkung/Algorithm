package study.day9.BF_14501;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static class Node {
        int day;
        int earn;

        public Node(int day, int earn) {
            this.day = day;
            this.earn = earn;
        }
    }

    static int N, max;
    static ArrayList<Node> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(in.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int day = Integer.parseInt(st.nextToken());
            int earn = Integer.parseInt(st.nextToken());
            list.add(new Node(day, earn));
        }
        //NullpointerException 방지.
        list.add(new Node(0, 0));

        max = 0;
        subset(1, 0);
        System.out.println(max);

        in.close();
    }

    private static void subset(int day, int earn) {
        if (day > N) return;

        int day_sum = day + list.get(day - 1).day;
        int earn_sum = earn + list.get(day - 1).earn;

        if (day + list.get(day - 1).day <= N + 1) max = Math.max(max, earn_sum);
        subset(day_sum, earn_sum);
        subset(day + 1, earn);
    }
}