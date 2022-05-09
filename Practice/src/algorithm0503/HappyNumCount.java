package algorithm0503;

public class HappyNumCount {

	public static void main(String[] args) {
		
		int num = 19;
		int count = 0;
		
			while(num != 1) {
				if(count <= 100) {
					// 숫자 -> 문자열 -> 문자배열
					char[] arr = Integer.toString(num).toCharArray();
					int sum = 0; // 총합
					int sqr = 0;
					
					for(int i = 0; i < arr.length; i++) {
						//System.out.println(i + "배열값 : " + arr[i]);
						sqr = (arr[i]-'0')*(arr[i]-'0');
						//System.out.println("배열제곱값 : " + sqr);
						sum += sqr;
						//System.out.println(num);
					}
					num = sum;
					count++;
				} else {
					break;
				}
			}
			
			// 결과
			if(count <= 100) {
				System.out.println("행복한 수(1)가 되기까지 횟수 : " + count);
			} else {
				System.out.println("-1");
			}
			
		
	}
}
