package algorithm0503;

public class AscDesc {

	
	public static void main(String[] args) {
		
		// 자연수
		int num = 2361;
		
		// 자연수 -> 문자열 -> 문자배열
		String str = Integer.toString(num);
		char[] chAsc = str.toCharArray(); // 오름차순 배열
		char[] chDesc = str.toCharArray(); // 내림차순 배열
		
		// 오름차순 정렬(2361 -> 1236)
		// 임시 저장소
		char temp = ' ';

		for(int i = 0; i < chAsc.length; i++) {
			
			for(int j = 0; j < chAsc.length-1-i; j++) {
				
				// 오름차순 정렬
				if(chAsc[j] > chAsc[j+1]) {
					temp = chAsc[j];
					chAsc[j] = chAsc[j+1];
					chAsc[j+1] = temp;
				}
				
				// 내림차순 정렬
				if(chDesc[j] < chDesc[j+1]) {
					temp = chDesc[j];
					chDesc[j] = chDesc[j+1];
					chDesc[j+1] = temp;
				}	
			}
		}

		// 오름차순(chAsc) + 내림차순(chDesc)
		int asc = Integer.parseInt(new String(chAsc));
		int desc = Integer.parseInt(new String(chDesc));
		
		System.out.println(asc + " + " + desc + " = " + (asc + desc));

	}

}
