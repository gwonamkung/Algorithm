package study.day10_coins.BOJ_2293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] answer = new int[k + 1];
        answer[0] = 1;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(in.readLine());

            for (int j = 0; j <= k; j++) {
                if (j >= num && answer[j - num] > 0) answer[j] += answer[j - num];
            }
        }
        System.out.println(answer[k]);
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();//동전 개수
//        int k = sc.nextInt();//만들어야 하는 값
//        int[] val = new int[k+1];
//        val[0]=1;
//        for(int i=0;i<n;i++) {//코인별로 채워나감
//            int coin = sc.nextInt();
//            for(int j=0;j<=k;j++) {//j원
//                if(j>=coin && val[j-coin]>0) {
//                    val[j] += val[j-coin];
//                }
//            }
//
//            for (int j = 0; j<=k;j++) System.out.print(val[j] + " ");
//            System.out.println();
//        }
//        System.out.println(val[k]);
//    }
//}

