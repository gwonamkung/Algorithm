package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sort_Counting {
    private static int[] cnt;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) arr[i] = Integer.parseInt(br.readLine());
        counting_sort(arr);
    }

    public static void counting_sort(int[] A) throws Exception {
        int max = 0;
        for (int i = 0; i < A.length; i++) max = Math.max(max, A[i]);
        cnt = new int[max + 1];

        for (int i = 0; i < A.length; i++) cnt[A[i]]++;
        for (int i = 1; i < cnt.length; i++) cnt[i] += cnt[i - 1];

        int[] result = new int[A.length];
        for (int i = A.length-1; i >=0; i--) {
            result[cnt[A[i]]-1] = A[i];
            cnt[A[i]]--;
        }
        for (int items : result) bw.write(items + "\n");
        bw.flush();
    }
}