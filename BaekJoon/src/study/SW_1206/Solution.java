package study.SW_1206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
SWExper_1206
1. 입력값이 많다 -> Scanner 대시 StringTokenizer 활용
2. 조망권을 확보할 수 있는지 확인한다.
>> 빌딩[i] 좌측 2개, 우측 2개의 높이가 빌딩[i]보다 높으면 조망권 확보 할 수 없음
3. 조망권을 확보한 세대 = 빌딩[i]의 높이 - (좌,우측 각 2개의 빌딩의 최대 높이) 이다.
4. 문제를 엄격하게 이해할 경우 좌우측 빈 2칸을 미리 빼두는 것도 방법, 나중에 비슷한 문제 런타임에러 뜨면 생각해보면 좋을듯.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int n = Integer.parseInt(in.readLine());
            int[] map = new int[n + 1];

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int i = 1; i <= n; i++) map[i] = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for (int i = 3; i <= n - 2; i++) {
                int me = map[i];
                int min1 = map[i - 1];
                int min2 = map[i - 2];
                int plus1 = map[i + 1];
                int plus2 = map[i + 2];
                int temp1 = Math.max(min1, min2);
                int temp2 = Math.max(plus1, plus2);

                int max = 0;
                max = Math.max(max, Math.max(temp1, temp2));

                if (max < me) cnt += me - max;
            }
            System.out.println("#" + t + " " + cnt);
        }
        in.close();
    }
}
