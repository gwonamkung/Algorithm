package level3;

import java.util.Scanner;

public class 준환이의운동관리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int time = sc.nextInt();
            if (time < min) System.out.println("#" + tcase + " " + (min - time));
            else if ((time > max)) System.out.println("#" + tcase + " -1");
            else System.out.println("#" + tcase + " 0");
        }
    }
}
