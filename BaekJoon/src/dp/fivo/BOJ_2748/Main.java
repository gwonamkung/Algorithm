package dp.fivo.BOJ_2748;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static long[] fivo;
    public static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int in = Integer.parseInt(br.readLine());
        System.out.println(fivo(in));
    }

    public static long fivo(int index) {
        fivo = new long[index + 1];
        if (index == 0) {
            fivo[0] = 0;
            return fivo[0];
        } else {
            fivo[1] = 1;
            for (int i = 2; i <= index; i++) {
                fivo[i] = fivo[i - 1] + fivo[i - 2];
                if (i == index) return fivo[i];
            }
            return fivo[index];
        }

    }
}