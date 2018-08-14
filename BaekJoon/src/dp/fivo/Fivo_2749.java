package dp.fivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fivo_2749 {
    public static long[] fivo;
    public static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long in = Long.parseLong(br.readLine());
        System.out.println(fivo(in)%1000000);
    }

    public static long fivo(long index) {
        fivo = new long[(int) index + 1];
        if (index == 0) {
            fivo[0] = 0;
            return fivo[0];
        } else {
            fivo[1] = 1;
            for (int i = 2; i <= index; i++) {
                fivo[i] = fivo[i - 1] + fivo[i - 2];
                if (i == index) return fivo[i];
            }
            return fivo[(int)index];
        }

    }
}