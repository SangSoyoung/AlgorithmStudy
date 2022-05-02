package algorithm01;

class Solution {
	public int[] solution(int[][] v) {
		int[] answer = new int[2];

		
		for(int i = 1; i < v.length; i++) {
			//System.out.println("v[i-1][0] =" + v[i-1][0]);
			//System.out.println("v[i-1][1] =" + v[i-1][1]);
			
			if(v[i-1][0] != v[i][0]) {
				answer[0] = v[i-1][0];
				//System.out.println("answer[0] = " + answer[0]);
				
				if(v[i-1][1] != v[i][1]) {
					answer[1] = v[i-1][1];
					//System.out.println("answer[1] = " + answer[1]);
				}
			}
		}
		
		return answer;
	}
}

public class P {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] v = {{1,1},{2,2},{1,2}};
		System.out.println("answer[0] = " + s.solution(v)[0]);
		System.out.println("answer[1] = " + s.solution(v)[1]);
	}

}
