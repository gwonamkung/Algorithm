package level3;

import java.util.Scanner;

public class 보충학습과평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                int x = sc.nextInt();
                if (x < 40) x = 40;
                sum += sc.nextInt();
            }
            System.out.println("#" + tcase + " " + sum / 5);
        }
    }
}
