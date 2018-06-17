package level1;

public class x간격이있는숫자 {
    static long[] answer;
    public static void main(String[] args) {
        solution(-5, 1000);
        for (long items:answer) System.out.println(items);
    }
    public static long[] solution(int x, int n) {
        answer = new long[n];
        for (int i = 1; i <= n; i++) answer[i-1] = x * i;
        return answer;
    }
}
