package level1;

public class 피보나치수 {
	public static void main(String[] args) {
		System.out.println(solution(2));
	}
	public static int solution(int n) {
		int[] fivo = new int[n];
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else if (fivo[n] == 0) fivo[n] =  solution(n-1) + solution(n-2);
		return fivo[n];
	}
}
