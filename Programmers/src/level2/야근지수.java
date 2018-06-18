package level2;

public class 야근지수 {
	public static void main(String[] args) {
		int[] work = {1, 1};
		System.out.println(solution(3, work));
	}
	
	public static long solution(int n, int[] works) {
        long answer = 0;
        int max = 0;
        int sum = 0;
        int nTemp = n;
        for (int i=0; i<works.length; i++) {
        	max = Math.max(max, works[i]);
        	sum += works[i];
        }
        int i = 0;
        while (nTemp != 0) {
        	if (works[i] == max) {
        		works[i]--;
        		nTemp--;
        	}
        	i++;
        	if (i == works.length) {
        		System.out.println("i: " + i);
        		i = 0;
        		max--;
        	}
        }
        for (int j=0; j<works.length; j++) answer += works[j]*works[j];
        if (n > sum) answer = 0;
        return answer;
    }
}
