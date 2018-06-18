package level2;

public class 다음큰숫자 {
	public static void main(String[] args) {
		System.out.println(solution(78));
	}
	
	public static int solution(int x) {
		int temp = x;
		while (true) {
			temp++;
			if (Integer.bitCount(x) == Integer.bitCount(temp)) {
				return temp;
			}
		}
	}
//	public static int binary(int a) {
//		int oneCnt = 0;
//		StringBuilder sb = new StringBuilder();
//		while (true) {
//			int na = a%2;
//			sb.append(na);
//			if (na == 1) oneCnt++;
//			a /= 2;
//			if(a==1) {
//				sb.append(1);
//				oneCnt++;
//				break;
//			}
//		}		
////		return Integer.parseInt(sb.reverse().toString());
//		return oneCnt;
//	}
}
