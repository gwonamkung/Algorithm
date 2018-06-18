package level1;

public class 콜라츠추측 {
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
	public static int solution(int num) {
	    int temp = num;  
		int answer = 0;
		while (temp != 1) {
			if(temp%2 == 0) {
				temp /= 2;
				answer++;
			}
			else if(temp%2==1) {
				temp = temp*3+1;
				answer++;
			}
			if(answer == 500) {
				answer = -1;
				break;
			}
			if(temp < 0) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
}
