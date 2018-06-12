package level1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
	public static void main(String[] args) {
		String[] a = {"남궁권", "홍길동", "호호호", "김서방"};
		System.out.println(solution(a));
	}
	
	public static String solution(String[] seoul) {
//		int answer;
//		int i=0;
//		while(!seoul[i].equals("김서방")) {
//			i++;
//			if(seoul[i].equals("김서방")) break;
//		}
//		answer = i;
//		return new String("김서방은 " + answer + "에 있다");
		return "김서방은" + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
}
