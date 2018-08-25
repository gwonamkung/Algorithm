package samsung.BOJ_5214_dummynode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, K, M, D[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + M + 1];
        for (int i = 1; i <= N + M; i++)
            A[i] = new ArrayList<Integer>();

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= K; j++) {
                int k = Integer.parseInt(st.nextToken());
                A[N + i].add(k);
                A[k].add(N + i);
            }
        }

        D = new int[N + M + 1];
        Arrays.fill(D, -1);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        D[1] = 1;
        dq.add(1);

        while (!dq.isEmpty()) {
            int x = dq.remove();
            if (x == N)
                break;
            for (int y : A[x])
                if (D[y] == -1) {
                    D[y] = D[x] + 1;
                    dq.add(y);
                }
        }

        System.out.println(D[N] == -1 ? -1 : (D[N] + 1) / 2);
    }
}