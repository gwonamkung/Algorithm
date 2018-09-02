package codebattle.battle32.no1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(in.readLine());

        for (int c = 1; c <= t; c++) {
            List<Integer> nums = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= N; i++) nums.add(i);

            st = new StringTokenizer(in.readLine());
            for (int i = 1; i <= S; i++) {
                int v = Integer.parseInt(st.nextToken());
                if (nums.contains(v)) nums.remove(nums.indexOf(v));
            }

            sb.append("#" + c + " ");
            for (int i = 0; i < nums.size(); i++) sb.append(nums.get(i) + " ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
        in.close();
    }
}
