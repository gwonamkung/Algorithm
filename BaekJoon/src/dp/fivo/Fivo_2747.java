package dp.fivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fivo_2747 {
    public static int[] fivo;
    public static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int in = Integer.parseInt(br.readLine());
        fivo(in);
    }

    public static void fivo(int index) {
        fivo = new int[index+1];
        fivo[0] = 0;
        fivo[1] = 1;
        if (fivo[index] > 0) System.out.println(fivo[index]);
        else {
            for (int i = 2; i <= index; i++) {
                fivo[i] = fivo[i-1] + fivo[i-2];
            }
            System.out.println(fivo[index]);
        }
    }
}