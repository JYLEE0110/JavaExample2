package Chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] score = { 10, 20, 30, 40, 53, 81, 89};
		
		sumArr(score);
	}

	//점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	public static void sumArr(int[] arr) {
		
		// 전달 받은 배열은 : int 타입의 배열이다. size 제약은 없다.
		
		int sum = 0;
		float avg = 0f;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		avg = sum / (float) arr.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
