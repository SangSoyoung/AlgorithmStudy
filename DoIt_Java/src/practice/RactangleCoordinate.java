package practice;

class Solution {
	
	public int[] solution(int [][]v){
		
		int x = 0;
		int y = 0;
		
		// x좌표에 중복되지 않는 값 찾기
		// answer[0] : x좌표 넣기
		if(v[0][0] == v[1][0]) {
			x = v[2][0];
		}else if(v[0][0] == v[2][0]) {
			x = v[1][0];
		}else if(v[1][0] == v[2][0]) {
			x = v[0][0];
		}
		
		// y좌표에 중복되지 않는 값 찾기
		//[1] : y좌표 넣기
		if(v[0][1] == v[1][1]) {
			y = v[2][1];
		}else if(v[0][1] == v[2][1]) {
			y = v[1][1];
		}else if(v[1][1] == v[2][1]) {
			y = v[0][1];
		}

		int[] answer = {x, y};
		return answer;
	}
	
}

public class RactangleCoordinate {
	
	public static void main(String[] args) {
		
		int [][]v = {{1,4}, {3,4}, {3,10}};
		Solution s = new Solution();
		
		for(int i=0; i<s.solution(v).length; i++) {
			System.out.print(s.solution(v)[i] + " ");
		}
		

	}

}
