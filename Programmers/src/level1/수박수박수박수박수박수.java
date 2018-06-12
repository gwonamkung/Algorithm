package level1;

public class 수박수박수박수박수박수 {
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	
	public static String solution(int n) {
//        String answer = "";
//        String a = "수";
//        String b = "박";
//        for(int i=0; i<n/2; i++) {
//        	if(i%2==0) answer += a;
//        	else answer += b;
//        } 
//    	return answer;
		return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
