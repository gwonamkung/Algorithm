package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 항구에들어오는배_숫자패턴수파악하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int len = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                l.add(sc.nextInt());
            }
            int cnt = 0;
            while (l.size() != 1) {
                int d = l.get(1) - l.get(0);
                int j = 1;
                while (true) {
                    if (l.get(j) % d == 1) l.remove(j);
                    else j++;
                    if (j == l.size()) break;
                }
                cnt++;
            }
            System.out.println("#" + tcase + " " + cnt);
        }
    }
}
