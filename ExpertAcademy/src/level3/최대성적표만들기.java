package level3;

import java.util.*;

public class 최대성적표만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int len = sc.nextInt();
            int o = sc.nextInt();
            int sum = 0;
            List<Integer> list = new ArrayList();
            for (int i = 0; i < len; i++) {
                list.add(sc.nextInt());
                if (i == len - 1) {
                    Collections.sort(list, Collections.reverseOrder());
                    int j = 0;
                    while (j < o) {
                        sum += list.get(j);
                        j++;
                    }
                }
            }
            System.out.println("#"+tcase+" "+ sum);
        }
    }
}
