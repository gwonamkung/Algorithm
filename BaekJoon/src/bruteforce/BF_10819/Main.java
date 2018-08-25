package bruteforce.BF_10819;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> list;
    static int[] arr;
    static boolean[] check;
    static int N, max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());

        check = new boolean[N + 1];
        list = new ArrayList<>();
        max = 0;
        dfs();
        System.out.println(max);
    }

    private static void dfs() {
        if (list.size() == N) calculate();

        //순서가 인정되는 완전탐색
        for (int i = 1; i <= N; i++) {
            if (check[i]) continue;
            check[i] = true;
            list.add(i);
            dfs();
            list.remove(list.size() - 1);
            check[i] = false;
        }
    }

    private static void calculate() {
        int sum = 0;
        for (int i = 0; i <= N - 2; i++) {
            sum += Math.abs(arr[list.get(i)] - arr[list.get(i + 1)]);
        }
        max = Math.max(max, sum);
    }

    private static void print() {
        for (int i = 1; i <= N; i++) System.out.print(list.get(i - 1) + " ");
        System.out.println();
    }
}