package DP;

import java.io.*;

public class DP_1003 {
    public static int memo[] = new int[100];
    public static int a;
    public static int b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            int value = Integer.valueOf(br.readLine());
            fivo(value);
            bw.write(String.valueOf(a) + " " + String.valueOf(b) + "\n");
            a=0;
            b=0;
        }
        br.close();
        bw.close();
    }

    public static int fivo(int x) {
        if (x == 0) {
            a++;
            return 0;
        } else if(x==1) {
            b++;
            return 1;
//        } else if (memo[x] > 0) {
//            return memo[x];
//        } else {
//            memo[x] = fivo(x-1) + fivo(x-2);
//            return memo[x];
//        }
        } else {
            return fivo(x-1) + fivo(x-2);
        }
    }
}