package level2;

import java.util.Scanner;

public class 시각덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tcase = 0; tcase < n; tcase++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int hSum = h1 + h2;
            int mSum = m1 + m2;

            if (mSum > 60) {
                mSum -= 60;
                hSum++;
                if (hSum > 12) hSum -= 12;
            } else if (hSum > 12) hSum -= 12;
            System.out.println("#" + (tcase+1) + " " + hSum + " " + mSum);
        }
    }
}
