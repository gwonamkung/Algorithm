package bruteforce.BF_6603;

import java.util.Scanner;

public class Main {

    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] input = sc.nextLine().split(" ");
            int k = Integer.parseInt(input[0]);
            if (k == 0) return;

            int[] arr = new int[k];
            for (int i = 0; i < k; i++) arr[i] = Integer.parseInt(input[i + 1]);

            cnt = 0;
            dfs(arr, 0, "");
            System.out.println();
        }
    }

    public static void dfs(int[] arr, int idx, String str) {
        if (cnt == 6) System.out.println(str);

        else {
            for (int i = idx; i < arr.length; i++) {
                cnt++;
                dfs(arr, i + 1, str + arr[i] + " ");
            }
        }
        cnt--;
    }
}