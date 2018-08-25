package datastructure.queue.BOJ_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static Queue<Integer> qu = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 1; i <= N; i++) qu.add(i);
        String result = "<";

        while (qu.size() > 1) {
            int cnt = 0;
            while (cnt < M - 1) {
                int v = qu.poll();
                qu.add(v);
                cnt++;
            }
            int v = qu.poll();
            result += v + ", ";
        }
        result += qu.poll() + ">";
        System.out.println(result);
    }
}
