package study.day7.BOJ_10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String command;
        int pushValue, top;

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            command = scanner.next();
            if (command.contains("push")) {
                pushValue = scanner.nextInt();
                stack.push(pushValue);
            } else if (command.equals("pop")) {
                if (stack.size() == 0) sb.append("-1\n");
                else {
                    top = stack.peek();
                    stack.pop();
                    sb.append(top + "\n");
                }
            } else if (command.equals("size")) sb.append(stack.size() + "\n");
              else if (command.equals("empty")) {
                if (stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.peek() + "\n");
            }
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}