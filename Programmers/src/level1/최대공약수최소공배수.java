package level1;

public class 최대공약수최소공배수 {
    static int[] answer = new int[2];

    public static void main(String[] args) {
        solution(2, 4);
        for (int items : answer) System.out.print(items + " ");
    }

    public static int[] solution(int x, int y) {
        int[] answer = new int[2];
         answer[0] = gcd(x, y);
         answer[1] = lcm(x, y);
         return answer;
     }
     static int gcd(int a, int b) { return (a % b == 0 ? b : gcd(b,a%b)); }
     static int lcm(int a, int b) { return a * b / gcd(a,b); }
}
