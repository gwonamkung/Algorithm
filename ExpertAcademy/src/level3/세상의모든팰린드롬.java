package level3;

import java.util.Scanner;

public class 세상의모든팰린드롬 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            if (sb.reverse().toString().equals(str)) System.out.println("#"+tcase+" Exist");
            else System.out.println("#"+tcase+" Not exist");
        }
    }
}
