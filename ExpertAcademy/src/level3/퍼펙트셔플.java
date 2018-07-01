package level3;

import java.util.Scanner;

public class 퍼펙트셔플 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int c = sc.nextInt();
            String[] s = (c % 2 == 0) ? new String[c / 2] : new String[c / 2 + 1];
            String[] s2 = new String[c / 2];
            boolean n = false;
            int j = 0;
            for (int i = 0; i < c; i++) {
                String str = sc.next();
                if (!n) s[j] = str;
                else s2[j] = str;
                j++;
                if (j == s.length) {
                    j = 0;
                    n = true;
                }
            }
            System.out.print("#" + tcase + " ");
            for (int i = 0; i < s2.length; i++) {
                System.out.print(s[i] + " ");
                System.out.print(s2[i] + " ");
            }
            if (c % 2 > 0) System.out.println(s[s.length - 1]);
            else System.out.println();
        }
    }
}
