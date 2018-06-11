package level1;

import java.util.Scanner;

public class 가운데문자가져오기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solution(s));
        scanner.close();
    }
    public static String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length%2 == 0) answer = s.substring(length/2-1, length/2+1);
        else answer = s.substring(length/2, length/2+1);
        return answer;
    }
}