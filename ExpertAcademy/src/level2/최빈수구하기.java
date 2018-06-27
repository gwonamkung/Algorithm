package level2;

import java.util.Scanner;

public class 최빈수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int tcase = 1; tcase <= n; tcase++) {
            int casenum = sc.nextInt();
            int[] arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                int index = sc.nextInt();
                arr[index]++;
            }
            int max = 0;
            int index = 0;
            for (int j =0; j<arr.length; j++) {
                if (max <= arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            System.out.println("#"+casenum+" "+index);
        }
    }
}
