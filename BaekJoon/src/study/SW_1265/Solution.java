package study.SW_1265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static int N, P;
    private static long answer;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tcase = Integer.parseInt(in.readLine());

        for (int t = 1; t <= tcase; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            answer = 1;

            search(N / P);
            sb.append("#" + t + " " + answer + "\n");
        }

        System.out.println(sb.toString());
        in.close();
    }

    private static long search(int num) {
        int m = N % P;

        //N과 P가 나누어 떨어지는 경우 (N/P)의 P승.
        if (m == 0) answer = (long) Math.pow(N / P, P);

        //N과 P가 나누어 떨어지지 않는 경우 (N/P)의 N%P승.
        //나머지만큼 (N/P)에게 1씩 줘서 나머지번만큼 곱함.
        else {
            answer = (long) Math.pow(N / P, P - m);
            for (int i = 1; i <= m; i++) answer *= ((N / P) + 1);
        }
        return answer;
    }
}
