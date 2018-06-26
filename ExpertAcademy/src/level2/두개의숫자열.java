package level2;

import java.util.Scanner;

public class 두개의숫자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tcase = 0; tcase < n; tcase++) {
            int[] x = new int[sc.nextInt()];
            int[] y = new int[sc.nextInt()];
            int l;
            int s;
            if (x.length > y.length) {
                s = y.length;
                l = x.length;
            } else {
                s = x.length;
                l = y.length;
            }
            int max = 0;
            for (int i = 0; i < x.length; i++) x[i] = sc.nextInt();
            for (int i = 0; i < y.length; i++) y[i] = sc.nextInt();
            for (int i = 0; i + s <= l; i++) {
                int sum = 0;
                for (int j = i; j < s + i; j++) {
                    if (x.length < y.length) sum += x[j - i] * y[j];
                    else sum += x[j] * y[j - i];
                }
                max = Math.max(sum, max);
            }
            System.out.println("#" + (tcase + 1) + " " + max);
        }
        sc.close();
    }
}
