package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 세가지수합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int tcase = 1; tcase <= t; tcase++) {
            int n = Integer.parseInt(br.readLine());
            long n1 = (n*(n+1))/2;
            long n2 = n*n;
            long n3 = n*(n+1);
            bw.write("#" + tcase + " " + n1 + " " + n2 + " " + n3 +"\n");
        }
        bw.flush();
    }
}
