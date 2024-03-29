package algorithm0503;

public class CommonPrefix {

	public static void main(String[] args) {
		
		String arr[] = {"abcedf", "abcefg", "abczxy"};
		StringBuilder result = new StringBuilder();
		boolean same = true;
		
		for(int i = 0; i < arr[0].length(); i++) {
			char temp = arr[0].charAt(i);
			
			for(int j = 1; j < arr.length; j++) {
				if(arr[j].length() <= i) {
					same = false;
					break;
				}
				else if(temp == arr[j].charAt(i)) {
					continue;
				}
				same = false;
				break;
			}
			if(same) {
				result.append(temp);
			} else {
				break;
			}
		}
		
		System.out.println(result.toString());
		
		// 문자열 배열 요소의 문자 비교해서 "접두어 배열(prefix)에 담기"
//		for(int i = -1; i<arr.length-2; i++) {
//			// 문자열 배열 요소 -> 문자배열
//			
//			// 문자 같은지 비교
//			// arr[0].toCharArray() == arr[1].toCharArray() => 접두어 배열에 담기
//			for(int j=0; j<arr[0].length(); j++) {
//				if(arr[i+1].toCharArray()[j] == arr[i+2].toCharArray()[j]) {
//					prefix[j] = arr[i+1].toCharArray()[j];
//				}
//			}
//		}
//		

	}

}
