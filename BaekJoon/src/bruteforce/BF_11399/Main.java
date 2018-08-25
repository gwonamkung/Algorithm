package bruteforce.BF_11399;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) time[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(time);

        int min = time[1];
        for (int i = 2; i <= N; i++) {
            time[i] += time[i - 1];
            min += time[i];
        }

        System.out.println(min);
    }

}
