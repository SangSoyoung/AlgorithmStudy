package practice;


public class NumArray {

	public int[] solution(int n) {
		
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			answer[i] = i+1;
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		NumArray na = new NumArray();
		int[] sArr = na.solution(3);
		
		for(int j=0; j<sArr.length; j++) {
			System.out.println(sArr[j]);
		}

	}

}
