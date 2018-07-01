package level3;

import java.util.Scanner;

public class 승률비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            double a = sc.nextDouble()/sc.nextDouble();
            double b = sc.nextDouble()/sc.nextDouble();

            if (a > b) System.out.println("#"+tcase+" ALICE");
            else if (a == b) System.out.println("#"+tcase+" DRAW");
            else System.out.println("#"+tcase+" BOB");

        }
    }
}
