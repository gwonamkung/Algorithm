package level3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 원재의메모리복구_1289 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t_case = Integer.parseInt(br.readLine());

        for (int t = 1; t <= t_case; t++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) sb.append("0");

            int len = str.length();
            int cnt = 0;
            boolean flag = false;
            while (!sb.toString().equals(str)) {

                for (int i = 0; i < len; i++) {
                    if (str.charAt(i) == '1') {
                        if(sb.toString().charAt(i) == '1') continue;
                        for (int j = i; j < len; j++) sb.replace(j, len, "1");
                        cnt++;
                        flag = true;
                        if (str.equals(sb.toString())) break;
                    } else if (flag) {
                        for (int j = i; j < len; j++) sb.replace(j, len, "0");
                        cnt++;
                        flag = false;
                        if (str.equals(sb.toString())) break;
                    }
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}