package level2;

public class 멀리뛰기 {
	static int[] r;
	public static void main(String[] args) {
		System.out.println(solution(7));
	}
	public static int solution(int x) {
		r = new int[4000];
		r[0] = 1;
		r[1] = 2;
		for (int i=2; i<x; i++) {
			r[i] = r[i-1] + r[i-2];
			System.out.println(r[i]);
		}
		return r[x-1];
	}
}
