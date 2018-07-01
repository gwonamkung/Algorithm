package level3;

import java.util.Scanner;

public class 일시간분_차이계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int d = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();
            int sum = d * 1440 + h * 60 + m;
            if (sum < 16511) System.out.println("#" + tcase + " -1");
            else System.out.println("#" + tcase + " " + (sum-16511));
        }
    }
}
