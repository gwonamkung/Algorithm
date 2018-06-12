package level1;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열내림차순정렬하기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(solution(s));
		scanner.close();
	}
	public static String solution(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new StringBuilder(new String(ch)).reverse().toString();
	}
}
