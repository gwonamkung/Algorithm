package level2;

import java.util.Scanner;

public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tcase = 0; tcase < n; tcase++) {
            int val = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0, e = 0;

            while (val != 1) {
                if (val % 2 == 0) {
                    a++;
                    val /= 2;
                } else if (val % 3 == 0) {
                    b++;
                    val /= 3;
                } else if (val % 5 == 0) {
                    c++;
                    val /= 5;
                } else if (val % 7 == 0) {
                    d++;
                    val /= 7;
                } else if (val % 11 == 0) {
                    e++;
                    val /= 11;
                }
            }
            System.out.println("#"+(tcase+1) + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
