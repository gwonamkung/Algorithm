package level3;

import java.util.Scanner;

class 최장공통부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            String str = sc.next();
            String str2 = sc.next();
            char[] ch = str.toCharArray();
            char[] ch2 = str2.toCharArray();
            int cnt = 0;
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < ch2.length; j++) {
                    if (ch[i] == ch[j]) {
                        cnt++;
                        break;
                    }
                }
            }
            System.out.println("#"+tcase+" "+cnt);
        }
    }
}
