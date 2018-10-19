package study.day10_coins.BOJ_2294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] answer = new int[K + 1];
        Arrays.fill(answer, K);

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(in.readLine());
            if (num > K) continue;
            answer[num] = 1;

            for (int j = num + 1; j <= K; j++) {
                answer[j] = Math.min(answer[j], answer[j - num] + 1);
            }
            System.out.println();
            for (int k = 1; k<=K; k++) System.out.print(answer[k] + " ");
            System.out.println();
        }

        System.out.println(answer[K] == K ? -1 : answer[K]);

        in.close();
    }
}