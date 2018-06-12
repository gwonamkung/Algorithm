package level1;

public class 문자열을정수로바꾸기 {
	public static void main(String[] args) {
		String a = "-1234";
		System.out.println(solution(a));
	}
	
	public static int solution(String s) {
	      int answer = 0;
	      if (s.contains("-")) {
	    	  answer = (Integer.parseInt(s));
	      }
	      else answer = Integer.parseInt(s);
	      return answer;
	}
}
