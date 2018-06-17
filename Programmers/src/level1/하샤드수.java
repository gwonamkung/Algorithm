package level1;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(18));
    }
    public static boolean solution(int x) {
        int len = String.valueOf(x).length();
        int temp = x;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += temp % 10;
            temp /= 10;
        }
        if (x%sum == 0) return true;
        else return false;
    }
}
