package level1;

import java.util.StringTokenizer;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(solution("a"));
    }
    public static String solution(String str) {
        String low = str.toLowerCase();
        StringTokenizer st = new StringTokenizer(low);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String tk = st.nextToken();
            String r = tk.substring(0, 1).toUpperCase() + tk.substring(1);
            sb.append(r);
            if (st.hasMoreTokens()) sb.append(" ");
        }
        return sb.toString();
    }
}
