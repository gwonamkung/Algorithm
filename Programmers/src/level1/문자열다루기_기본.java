package level1;

import java.util.Scanner;

public class 문자열다루기_기본 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
		scanner.close();
	}
	
	public static boolean solution(String s) {
		boolean bool = false;
		char[] ch = s.toCharArray();
		int[] b = new int[ch.length];
		for(int i=0;i<ch.length;i++) b[i] = ch[i];
		if (s.length() == 4 || s.length() == 6) bool = true; 
		for(int i=0; i<b.length; i++) {
			if(b[i] < 48 || b[i] > 57 ) {
				bool = false;
				break;
			}
		}
		return bool;
	}
}
