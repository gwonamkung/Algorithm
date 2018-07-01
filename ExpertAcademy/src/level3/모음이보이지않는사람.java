package level3;

import java.util.Scanner;

public class 모음이보이지않는사람 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                switch (ch[i]) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' : break;
                    default: sb.append(ch[i]); break;
                }
            }
            System.out.println("#"+tcase+" "+sb.toString());
        }
    }
}
