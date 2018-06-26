package level2;

import java.util.Scanner;

public class 스도쿠검증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int tcase = 0; tcase < n; tcase++) {
            int[][] arr = new int[9][9];
            boolean con = true;
            int answer;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) arr[i][j] = sc.nextInt();
            }
            if (con) {
                for (int i = 0; i < 9; i++) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int j = 0; j < 9; j++) {
                        sum1 += arr[j][i];
                        sum2 += arr[i][j];
                    }
                    if (sum1 != 45 || sum2 != 45) {
                        con = false;
                        break;
                    }
                }
            }
            if (con) {
                int sum = 0;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 3; j++) sum += arr[i][j];
                    if (i == 2 || i == 5) {
                        if (sum != 45) {
                            con = false;
                            break;
                        }
                        sum = 0;
                    }
                }
            }
            if (!con) answer = 0;
            else answer = 1;
            System.out.println("#" + (tcase + 1) + " " + answer);
        }
    }
}
