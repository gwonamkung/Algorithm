package dp.BOJ_1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] result = new int[n + 1];
        result[1] = arr[1];

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                if (result[i - 1] + arr[i] > arr[i]) result[i] = result[i - 1] + arr[i];
                else result[i] = arr[i];
            }
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) max = Math.max(max, result[i]);
            System.out.println(max);
        } else System.out.println(result[1]);
    }
}
