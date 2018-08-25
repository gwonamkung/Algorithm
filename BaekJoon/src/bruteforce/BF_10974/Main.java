package bruteforce.BF_10974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list;
    static boolean[] check;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        check = new boolean[N + 1];
        list = new ArrayList<>();

        dfs();
    }

    private static void dfs() {
        if (list.size() == N) {
            for (int i = 1; i <= N; i++) System.out.print(list.get(i - 1) + " ");
            System.out.println();
        }

        for (int i = 1; i <= N; i++) {
            if (check[i]) continue;
            check[i] = true;
            list.add(i);
            dfs();
            list.remove(list.size() - 1);
            check[i] = false;
        }
    }
}