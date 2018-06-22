package level2;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tcase = 0; tcase < n; tcase++) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("#" + (tcase + 1) + " ");
            for (int items : arr) System.out.print(items + " ");
            System.out.println();
        }
    }
}
