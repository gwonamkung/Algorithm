package level3;

import java.util.Scanner;

public class 세상의모든팰린드롬2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            char[] ch = str.toCharArray();
            for (int i=0; i<ch.length; i++) {
                if (ch[i] != '*') sb.append(ch[i]);
            }
            String str2 = sb.toString();
            sb = new StringBuilder(str2);
            System.out.println(str2);
            if (sb.reverse().toString().equals(str2)) System.out.println("#"+tcase+" Exist");
            else System.out.println("#"+tcase+" Not exist");
        }
    }
}