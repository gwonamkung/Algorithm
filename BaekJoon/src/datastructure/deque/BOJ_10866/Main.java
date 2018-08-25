package datastructure.deque.BOJ_10866;

import java.util.*;

public class Main {
    static Deque<Integer> dq;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        dq = new ArrayDeque<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String cmd = sc.next();
            int r = 0;
            switch (cmd) {
                case "push_front":
                    int v = sc.nextInt();
                    dq.addFirst(v);
                    break;
                case "push_back":
                    dq.addLast(sc.nextInt());
                    break;
                case "pop_front":
                    if (dq.isEmpty()) r = -1;
                    else r = dq.pollFirst();
                case "pop_back":
                    if (dq.isEmpty()) r = -1;
                    else r = dq.pollLast();
                case "size":
                    r = dq.size();
                case "empty":
                    if (dq.isEmpty()) r = 1;
                    else r = 0;
                case "front":
                    if (dq.isEmpty()) r = -1;
                    else r = dq.peekFirst();
                case "back":
                    if (dq.isEmpty()) r = -1;
                    else r = dq.peekLast();
            }
            System.out.println(r);
        }
    }
}
