package dp.BOJ_1932;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - (n - 1) + i; j++) arr[i][j] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - (n - 1) + i; j++) {
                if (j == 0) arr[i][j] += arr[i - 1][j];
                else if (j == i) arr[i][j] += arr[i - 1][j - 1];
                else {
                    if (arr[i][j] + arr[i - 1][j - 1] >= arr[i][j] + arr[i - 1][j]) arr[i][j] += arr[i - 1][j - 1];
                    else arr[i][j] += arr[i - 1][j];
                }
                if (i == n - 1 && j == arr[i].length - 1) {
                    for (int k = 0; k < arr[i].length; k++) max = Math.max(max, arr[i][k]);
                }
            }
        }
        System.out.println(max);
    }
}