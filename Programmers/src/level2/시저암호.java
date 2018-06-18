package level2;

public class 시저암호 {
	public static void main(String[] args) {
		String a = "zabcdefghijklmnopqrstuvwxy";
		System.out.println(solution(a, 25));
	}
	public static String solution(String s, int n) {
		char[] ch = s.toCharArray();
		for (int i=0; i<ch.length; i++) {
			for(int j=0; j<n; j++) {
				if (ch[i] != ' ' ) {
					if (ch[i] == 'z' || ch[i] == 'Z') ch[i] -=26;
					ch[i]++;
				}
			}
		}
		return new String(ch);
	}
}
