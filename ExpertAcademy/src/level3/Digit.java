package level3;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            long val = sc.nextLong();
            long sum;
            while (true) {
                sum = 0;
                while (true) {
                    sum += val % 10;
                    if (val < 10) break;
                    val /= 10;
                }
                if (sum < 10) break;
                val = sum;
            }
            System.out.println("#"+tcase+" "+sum);
        }
    }
}

