package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 비밀번호_1234 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            List<Character> list = new ArrayList<>();

            for (int j = 0; j < len; j++) list.add(str.charAt(j));

            for (int t = 0; t < list.size(); t++) {
                if (list.get(t) == list.get(t + 1)) {
                    list.remove(t);
                    list.remove(t);
                    if (t == list.size()-1 || t== list.size()) break;
                    t -= 2;
                    if(t<-1) t = -1;
                }
            }
            System.out.print("#" + i + " ");
            for(char items : list) System.out.print(items);
            System.out.println();
        }
    }
}