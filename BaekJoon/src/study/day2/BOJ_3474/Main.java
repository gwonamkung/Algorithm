package study.day2.BOJ_3474;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tcase = Integer.parseInt(in.readLine());

        for (int t = 1; t <= tcase; t++) {
            int n = Integer.parseInt(in.readLine());
            int sum = 0;

            for (int i = 5; i <= n; i *= 5) sum += n / i;

            sb.append(sum + "\n");
        }
        System.out.println(sb.toString());

        in.close();
    }
}


