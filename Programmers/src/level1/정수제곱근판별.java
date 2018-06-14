package level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
    public static long solution(long n) {
        long a = (long) Math.sqrt(n);
        if(a*a == n) return (a+1)*(a+1);
        else return -1;
    }
}
