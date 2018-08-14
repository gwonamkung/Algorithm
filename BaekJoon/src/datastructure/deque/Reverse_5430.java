package datastructure.deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Reverse_5430 {
    private static Deque<String> dq;
    public static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int tcase = 1; tcase <= t; tcase++) {
            dq = new ArrayDeque<>();
            String cmd = br.readLine();
            int len = Integer.parseInt(br.readLine());
            String v = br.readLine();
            boolean error = false;
            boolean reverse = false;
            sb = new StringBuilder();
            String[] strArr = v.substring(1, v.length() - 1).split(",");

            if (!strArr[0].isEmpty()) for (int i = 0; i < strArr.length; i++) dq.add(strArr[i]);

            char[] ch = cmd.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'R') reverse = !reverse;
                else {
                    try {
                        if (!dq.peekFirst().equals("")) {
                            if (!reverse) dq.pollFirst();
                            else dq.pollLast();
                        }

                    } catch (Exception e) {
                        sb.append("error\n");
                        error = true;
                        break;
                    }
                }
            }

            if (!error) {
                if (dq.size() > 0) {
                    int s = dq.size();
                    sb.append("[");
                    if (!reverse) {
                        for (int i = 0; i < s; i++) {
                            String normalStr = dq.pollFirst();
                            if (i == s - 1) sb.append(normalStr + "]\n");
                            else sb.append(normalStr + ",");
                        }
                    } else {
                        for (int i = 0; i < s; i++) {
                            String reverseStr = dq.pollLast();
                            if (i == s - 1) sb.append(reverseStr + "]\n");
                            else sb.append(reverseStr + ",");
                        }
                    }
                } else sb.append("[]\n");
            }
            bw.write(sb.toString());
            bw.flush();
        }
    }
}