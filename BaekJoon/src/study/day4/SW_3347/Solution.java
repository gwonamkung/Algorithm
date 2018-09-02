package study.day4.SW_3347;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tcase = Integer.parseInt(in.readLine());

        for (int c = 1; c <= tcase; c++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] sport = new int[N + 1];
            st = new StringTokenizer(in.readLine());
            for (int i = 1; i <= N; i++) sport[i] = Integer.parseInt(st.nextToken());

            int[] cnt = new int[N + 1];
            st = new StringTokenizer(in.readLine());
            for (int i = 1; i <= M; i++) {
                int std = Integer.parseInt(st.nextToken());
                for (int j = 1; j <= N; j++) {
                    if (sport[j] <= std) {
                        cnt[j]++;
                        break;
                    }
                }
            }

            int max = 0;
            for (int i = 1; i <= N; i++) {
                if (cnt[i] > cnt[max]) max = i;
            }
            sb.append("#" + c + " " + max + "\n");
        }

        System.out.println(sb.toString());
        in.close();
    }
}
