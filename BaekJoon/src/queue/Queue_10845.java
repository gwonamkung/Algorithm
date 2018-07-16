package queue;

import java.util.*;

public class Queue_10845 {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                q.add(sc.nextInt());
            } else if (cmd.equals("front")) {
                if(q.size() == 0) System.out.println("-1");
                else System.out.println(q.peekFirst());
            } else if (cmd.equals("back")) {
                if(q.size() == 0) System.out.println("-1");
                else System.out.println(q.peekLast());
            } else if (cmd.equals("empty")) {
                if(q.isEmpty()) System.out.println("1");
                else System.out.println("0");
            } else if (cmd.equals("size")) {
                System.out.println(q.size());
            } else if (cmd.equals("pop")) {
                if(q.size() == 0) System.out.println("-1");
                else System.out.println(q.poll());
            }
        }
    }
}
