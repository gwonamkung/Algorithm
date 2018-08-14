package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basic_CountingSort_1221 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t_case = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String no_use = st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            String[] value = new String[N];
            int index = 0;
            int[] cnt = new int[10];
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                if (str.equals("ZRO")) cnt[0]++;
                else if (str.equals("ONE")) cnt[1]++;
                else if (str.equals("TWO")) cnt[2]++;
                else if (str.equals("THR")) cnt[3]++;
                else if (str.equals("FOR")) cnt[4]++;
                else if (str.equals("FIV")) cnt[5]++;
                else if (str.equals("SIX")) cnt[6]++;
                else if (str.equals("SVN")) cnt[7]++;
                else if (str.equals("EGT")) cnt[8]++;
                else if (str.equals("NIN")) cnt[9]++;

                value[index] = str;
                index++;
            }
            for (int j = 1; j < cnt.length; j++) cnt[j] += cnt[j - 1];

            //바로 출력하지 않고 원본 배열 뒤에서부터 정렬
            String[] result = new String[N];
            for (int j = N - 1; j >= 0; j--) {
                String s = value[j];
                if (s.equals("ZRO")) {
                    result[cnt[0] - 1] = s;
                    cnt[0]--;
                } else if (s.equals("ONE")) {
                    result[cnt[1] - 1] = s;
                    cnt[1]--;
                } else if (s.equals("TWO")) {
                    result[cnt[2] - 1] = s;
                    cnt[2]--;
                } else if (s.equals("THR")) {
                    result[cnt[3] - 1] = s;
                    cnt[3]--;
                } else if (s.equals("FOR")) {
                    result[cnt[4] - 1] = s;
                    cnt[4]--;
                } else if (s.equals("FIV")) {
                    result[cnt[5] - 1] = s;
                    cnt[5]--;
                } else if (s.equals("SIX")) {
                    result[cnt[6] - 1] = s;
                    cnt[6]--;
                } else if (s.equals("SVN")) {
                    result[cnt[7] - 1] = s;
                    cnt[7]--;
                } else if (s.equals("EGT")) {
                    result[cnt[8] - 1] = s;
                    cnt[8]--;
                } else if (s.equals("NIN")) {
                    result[cnt[9] - 1] = s;
                    cnt[9]--;
                }
            }
            System.out.println("#" + i);
            for (String items : result) System.out.print(items + " ");
            System.out.println();
        }
    }
}