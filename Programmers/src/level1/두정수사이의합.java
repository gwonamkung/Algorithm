package level1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 3));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if (a == b) return a;
        else if (a > b || a<b) {
            for (int i = (a>b)? b:a; i<=((a>b)?a:b);i++) {
                answer += i;
            }
        }
        return answer;
    }
}
