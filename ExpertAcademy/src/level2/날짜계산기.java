package level2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 날짜계산기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tcase = 0; tcase < n; tcase++) {
            int[] arr = new int[8];
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            Date date = new Date();
            Date date2 = new Date();
            date.setMonth(m1);
            date.setDate(d1);
            date2.setMonth(m2);
            date2.setDate(d2);

            Calendar c = Calendar.getInstance();
        }
    }
}
