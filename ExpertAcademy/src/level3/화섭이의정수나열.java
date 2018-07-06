package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 화섭이의정수나열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(sc.nextInt());
            }
            Long val = Long.parseLong(sb.toString());
            Long temp = val;
            List<Long> list = new ArrayList<>();
            while (true) {
                list.add(temp);
                list.add(temp%10);
                temp /= 10;
                if (temp < 10) {
                    list.add(temp);
                    break;
                }
            }
            for (Long items:list) System.out.println(items);
            Long i = 0L;
            while (true) {
                if (list.contains(i)) i++;
                else break;
            }
            System.out.println("#"+tcase+" "+i);
        }
    }
}
