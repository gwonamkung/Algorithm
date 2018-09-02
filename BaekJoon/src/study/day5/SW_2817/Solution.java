package study.day5.SW_2817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static int N, A, cnt, num[];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            A = Integer.parseInt(st.nextToken());

            //각 테스트 케이스마다 cnt 초기화.
            cnt = 0;
            num = new int[N + 1];
            st = new StringTokenizer(in.readLine());
            for (int i = 1; i <= N; i++) num[i] = Integer.parseInt(st.nextToken());

            bf(1, 0);
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb.toString());
        in.close();
    }

    private static void bf(int idx, int sum) {
        if (sum == A) {
            cnt++;
            return;
        }

        if (idx > N) return;
        int sum_num = sum + num[idx];

        bf(idx + 1, sum_num);
        bf(idx + 1, sum);
    }
}
