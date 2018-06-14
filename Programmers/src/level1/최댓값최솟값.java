package level1;

import java.util.StringTokenizer;

public class 최댓값최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = -10000000, min = 1000000000;
        while (st.hasMoreTokens()) {
            int token = Integer.parseInt(st.nextToken());
            max = Math.max(max, token);
            min = Math.min(min, token);
        }
        return new String(min + " " + max);
    }
}
