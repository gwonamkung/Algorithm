package study.day3.BOJ_2877;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();


        int len = (int) log2(k + 1, 2);
        int num = k + 1 - (int) Math.pow(2, len);
        sb.append(Integer.toBinaryString(num));

        //길이를 맞혀줌.
        while (sb.toString().length() < len) sb.insert(0, "0");

        String str = sb.toString();
        sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') sb.append("4");
            else sb.append("7");
        }

        System.out.println(sb.toString());
        in.close();
    }

    //밑이 2인 로그함수
    private static double log2(int num, int base) {
        return Math.log(num) / Math.log(2);
    }
}

//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        num = num +1;
//
//        String str = Integer.toBinaryString(num);
//        System.out.println(str);
//        for(int i=1; i<str.length(); i++){
//            if(str.charAt(i)=='0'){
//                System.out.print("4");
//            }else{
//                System.out.print("7");
//            }
//
//        }
//    }
//}