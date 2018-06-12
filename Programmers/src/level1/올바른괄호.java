package level1;

import java.util.Scanner;

public class 올바른괄호 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
		scanner.close();
	}
	
	static boolean solution(String s) {
        boolean open = false;
		boolean answer = false;
		int cnt = 0;
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == '(') {
				open = true;
				cnt++;
			}
			else if(ch[i] == ')') {
				cnt--;
				if(cnt < 0) {
					answer = false;
					break;
				}
				if(cnt == 0) open = false;
			}
		}
		if(cnt == 0 && open == false) answer = true; 
        return answer;
    }
}
