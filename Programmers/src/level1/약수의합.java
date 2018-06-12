package level1;

public class 약수의합 {
	public static void main(String[] args) {
		System.out.println(solution(1));
	}
	
	public static int solution(int n) { 
		int answer = 0;
		if(n>1) answer = n+1;
		else if (n==1) answer = 1;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) answer+=i;
		}
	      return answer;
	  }
}
