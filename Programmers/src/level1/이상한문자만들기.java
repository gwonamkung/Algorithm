package level1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(solution(a));
    }

    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            String strL = str.toLowerCase();
            char[] ch = strL.toCharArray();
            for (int i = 0; i < ch.length; i++) if (i % 2 == 0) ch[i] -= 32;
            answer += new String(ch);
            if (st.hasMoreTokens()) answer += " ";
        }
        return answer;
    }
}
