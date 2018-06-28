package level2;

import java.util.Scanner;

public class 아름이의돌던지기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tcase = 1; tcase <= T; tcase++) {
            int min = 100000;
            int P = sc.nextInt();
            int[] arr = new int[P];
            for (int i = 0; i < P; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, Math.abs(arr[i]));
            }
            int cnt = 0;
            for (int i = 0; i < P; i++) {
                if (Math.abs(arr[i]) == min) cnt++;
            }
            System.out.println("#"+tcase+" "+min+" " + cnt);
        }
    }
}
