package level1;

public class 소수찾기 {
	public int solution(int n) {
        int[] a = new int[n];
        int cnt = 0;
        for(int i=2; i<=n; i++) {
            if(getPrime(i)) cnt++;
        }
        return cnt;
    }
    boolean getPrime(int num) {
		if(num <= 1) return false;
		if(num%2 == 0 && num > 2) return false;
		  
		for(int i=3; i*i<=num; i+=2) {
			if(i * (num/i) == num){
				return false;
			}
		}
		return true;
	}
}
