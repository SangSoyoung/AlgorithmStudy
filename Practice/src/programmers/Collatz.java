package programmers;

public class Collatz {

	public int solution(int num) {

        long number = num;
        int answer = 0;
        
        // 1이 될때까지 반복
        while(number != 1){
            // 짝수면 2로 나누기
            if(number%2 == 0){
                number = number/2;
                answer++;
            // 홀수면 3을 곱하고 1을 더하기
            } else if((number%2 == 1) && (number > 1)){
                number = (number*3)+1;
                answer++;
            } 
            
            // 500번째에도 1이 안되면 -1 반환
            if(answer == 500){
                answer = -1;
                break;
            } else if(number == 1) {
            	break;
            }
        }

        
        return answer;
    }

	public static void main(String[] args) {
		Collatz c = new Collatz();
		System.out.println(c.solution(626331));

	}

}
