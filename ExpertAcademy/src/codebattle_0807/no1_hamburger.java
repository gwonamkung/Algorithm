package codebattle_0807;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no1_hamburger {
    static class Node {
        int score;
        int cal;

        public Node(int score, int cal) {
            this.score = score;
            this.cal = cal;
        }
    }

    static int max, N, T;
    static ArrayList<Node> arrayList;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tcase = Integer.parseInt(in.readLine());
        for (int t = 1; t <= tcase; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            T = Integer.parseInt(st.nextToken());

            arrayList = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(in.readLine());
                arrayList.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            max = 0;
            subset(1, 0, 0);
            System.out.println("#" + t + " " + max);
        }
        in.close();
    }

    private static void subset(int idx, int score, int kcal) {
        if (idx > N) return;

        int kcal_sum = kcal + arrayList.get(idx - 1).cal;
        int score_sum = score + arrayList.get(idx - 1).score;

        if (kcal_sum <= T) max = Math.max(max, score_sum);

        subset(idx + 1, score_sum, kcal_sum);
        subset(idx + 1, score, kcal);
    }
}