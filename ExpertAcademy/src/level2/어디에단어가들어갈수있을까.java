package level2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int test_case = 0; test_case < n; test_case++) {
            int cnt = 0;
            int size = sc.nextInt();
            int len = sc.nextInt();
            int[][] arr = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //검사
            int vTemp = 0;
            int hTemp = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (arr[i][j] == 1) {
                        if (j > 0) {
                            if (arr[i][j - 1] == 1 || vTemp == 0) vTemp++;
                        } else if (j == 0) vTemp++;

                        if (j == size - 1) {
                            if (vTemp == len) cnt++;
                            vTemp = 0;
                        }
                    } else if (arr[i][j] == 0) {
                        if (vTemp == len) cnt++;
                        vTemp = 0;
                    }

                    if (arr[j][i] == 1) {
                        if (j > 0) {
                            if (arr[j - 1][i] == 1 || hTemp == 0) hTemp++;
                        } else if (j == 0) hTemp++;

                        if (j == size - 1) {
                            if (hTemp == len) cnt++;
                            hTemp = 0;
                        }
                    } else if (arr[j][i] == 0) {
                        if (hTemp == len) cnt++;
                        hTemp = 0;
                    }
                }
            }
            System.out.println("#" + (test_case + 1) + " " + cnt);
        }
    }
}