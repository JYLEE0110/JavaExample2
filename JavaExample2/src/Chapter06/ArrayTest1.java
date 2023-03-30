package Chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열의 선언
		int[] scores = {60,80,65,66,99,98,77,85,36,57};

		//배열의 생성
//		scores = new int[10]; // int type의 요소 10개를 가지는 배열 인스턴스 생성
		
		//배열 요소의 참조
		//베열이름[intdex]
		//index => 0 ~ N-1
		//요소의 개수 => 배열변수.length
		
		//배열도 인스턴스이기 때문에 초기화를 안해줘도 default로 0으로 초기화 되어있다.
		for(int i = 0; i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
//		scores[0] = 60;
//		scores[1] = 80;
//		scores[2] = 65;
//		scores[3] = 66;
//		scores[4] = 99;
//		scores[5] = 98;
//		scores[6] = 77;
//		scores[7] = 85;
//		scores[8] = 36;
//		scores[9] = 57;
		System.out.println("=========================================");
		int sum = 0;
		float avg = 0.0f;
		for(int i = 0; i<scores.length;i++) {
			sum+=scores[i];
			System.out.println(scores[i]);
		}
		avg = sum / (float)scores.length;
		System.out.println("총합은 " + sum);
		System.out.println("평균은 " + avg);
	}

}
