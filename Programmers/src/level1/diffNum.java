package level1;

import java.util.*;

public class diffNum {
	public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
        	if(list.lastIndexOf(arr[i]) != list.size()-1) list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) answer[i] = list.get(i);
        return answer;
	}
}