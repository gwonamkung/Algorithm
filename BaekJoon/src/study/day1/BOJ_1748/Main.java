package study.day1.BOJ_1748;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[8];
        arr[0] = 9;

        int x = 10;
        for (int i = 1; i < 8; i++) {
            arr[i] = (arr[0] * (i + 1)) * x + arr[i - 1];
            x *= 10;
        }

        int len = String.valueOf(n).length();
        for (int i = 0; i < len - 1; i++) sb.append("9");

        if (n > 9) System.out.println(arr[len - 2] + (n - (Integer.parseInt(sb.toString()))) * len);
        else System.out.println(n);
    }
}
