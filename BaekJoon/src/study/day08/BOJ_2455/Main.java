package study.day08.BOJ_2455;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int people = 0;
        for (int i = 1; i <= 4; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());

            people += on - off;
            max = Math.max(max, people);
        }

        System.out.println(max);
    }
}
