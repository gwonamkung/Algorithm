package bruteforce;

public class BF_1182 {
    static int cnt;
    static boolean[] check;

    public static void main(String[] args) throws Exception {

    }
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 방법 1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    static int N, S, Cnt;
//    static int[] input;
//
//    public static void main(String[] args) throws Exception {
//        //System.setIn(new FileInputStream("sample_input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        S = Integer.parseInt(st.nextToken());
//
//        input = new int[N + 1];
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <= N; i++) {
//            input[i] = Integer.parseInt(st.nextToken());
//        }
//
//        subset(1, 0);
//
//        System.out.println(Cnt);
//
//    }//end main
//
//    private static void subset(int index, int sum) {
//        if (index > N) {
//            return;
//        }
//
//        int currentSum = sum + input[index];
//
//        if (currentSum == S) {
//            Cnt++;
//        }
//
//        subset(index + 1, currentSum);
//        subset(index + 1, sum);
//    }
//}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 방법 2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class Main {
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