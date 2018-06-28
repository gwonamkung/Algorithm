package level2;

import java.util.Scanner;

public class 파리퇴치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int test_case = 0; test_case < n; test_case++) {
            int size = sc.nextInt();
            int answerSize = sc.nextInt();
            int[][] arr = new int[size][size];
            boolean end = false;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) arr[i][j] = sc.nextInt();
            }
            int sum;
            int max = 0;
            int cnt = 0;
            int i = 0;
            for (int cycle = 0; cycle <= size - answerSize; cycle++) {
                sum = 0;
                int j = 0 + cnt;
                while (!end) {
                    if (j == answerSize + cnt) {
                        j = 0;
                        i++;
                    }
                    if (i == answerSize) break;
                    sum += arr[i][j];
                    j++;
                }
                max = Math.max(max, sum);
                cnt++;
            }
//            System.out.println("sum: " + sum);
            System.out.println("max: " + max);
//            max = Math.max(max, sum);
//			System.out.println("#"+test_case+1+" "+max);
            sum = 0;
            max = 0;
        }
    }
}
