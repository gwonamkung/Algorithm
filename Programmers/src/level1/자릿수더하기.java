package level1;

public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(10000));
    }

    public static int solution(int n) {
        int answer = 0;
        while (true) {
            answer += n % 10;

            if(n<10) break;
            n /= 10;
        }

        return answer;
    }
}
