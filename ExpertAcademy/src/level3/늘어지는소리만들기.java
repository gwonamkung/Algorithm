package level3;

import java.util.*;

public class 늘어지는소리만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            String str = scanner.next();
            char[] ch = str.toCharArray();
            String[] strArr = new String[ch.length];
            for (int i = 0; i < ch.length; i++) strArr[i] = String.valueOf(ch[i]);
            int cnt = scanner.nextInt();
            for (int i = 0; i < cnt; i++) {
                int index = scanner.nextInt();
                if (index == 0)  strArr[0] = "-" + strArr[0];
                else strArr[index - 1] += "-";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) sb.append(strArr[i]);
            System.out.println("#"+tcase+" "+sb);
        }
    }
}
