package level1;

import java.util.Scanner;

public class 가장긴팰린드롬 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
		scanner.close();
	}
	
	public static int solution(String s) {
		int answer = 0;
		char[] ch = s.toCharArray();
        for(int i=0; i< ch.length/2; i++) {
        	if (ch[i] == ch[ch.length-1-i]) {
        		if(i==ch.length/2-1) {
        			answer = s.length();
        		}
        	} else {
        		
        	}
        }
        return answer;
    }
}
