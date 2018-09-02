package codebattle.battle32.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    - 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다.
    - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다.
    - 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
    - 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(in.readLine());

        for (int c = 1; c <= t; c++) {
            String str = in.readLine();
            int line = 0;
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    if (i < str.length() - 2 && str.charAt(i + 1) == ')') {
                        sum += line * 1;
                        i++;
                    }
                    else {
                        line++;
                        sum++;
                    }
                } else if (str.charAt(i) == ')') line--;

            }

            sb.append("#" + c + " " + sum + "\n");
        }

        System.out.println(sb.toString());
        in.close();
    }
}
