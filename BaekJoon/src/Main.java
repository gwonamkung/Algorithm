import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, S, cnt, arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        st = new StringTokenizer(in.readLine());
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

        subset(1, 0);
        System.out.println(cnt);

        in.close();
    }

    private static void subset(int idx, int sum) {
        if(idx > N) return;

        int current_sum = sum + arr[idx];

        if(current_sum == S) cnt++;

        subset(idx + 1, current_sum);
        subset(idx + 1, sum);
    }
}