package bruteforce.BF_1182;

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

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 방법 2 : 매우 느림 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//    public static void dfs(int idx, String str) {
//        if (!str.equals("")) {
//            String[] s = str.split(" ");
//
//            int sum = 0;
//            for (int i = 0; i < s.length; i++) sum += input[Integer.parseInt(s[i])];
//
//            if (sum == S) Cnt++;
//        }
//
//        for (int i = idx; i < input.length; i++) dfs(i + 1, str + i + " ");
//    }

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 방법 3 : 비트마스킹 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class main {
//    public static int n, s, arr[], visit, cnt;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] line = in.readLine().split(" ");
//        int i;
//
//        n = Integer.parseInt(line[0]);
//        s = Integer.parseInt(line[1]);
//        arr = new int[n];
//
//        line = in.readLine().split(" ");
//        for (i = 0; i < n; i++) arr[i] = Integer.parseInt(line[i]);
//
//        for (i = 0; i < n; i++) {
//            visit = visit | (1 << i);
//            dfs(i, arr[i]);
//            visit = visit & ~(1 << i);
//        }
//
//        out.write(String.valueOf(cnt));
//        out.close();
//        in.close();
//    }
//
//    private static void dfs(int idx, int sum) {
//        //dfs가 호출되는 매 순간이 서로 다른 집합이므로 매번 sum과 s을 비교
//        if (sum == s) cnt++;
//
//        //i = idx + 1부터 시작함을 주목!
//        for (int i = idx + 1; i < n; i++) {
//            if ((visit & (1 << i)) == 0) {
//                visit = visit | (1 << i);
//                dfs(i, sum + arr[i]);
//                visit = visit & ~(1 << i);
//            }
//        }
//    }
//}