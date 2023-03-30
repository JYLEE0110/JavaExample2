package Chapter06;

public class ArrayTest6 {

	public static void main(String[] args) {

		// 2차원 배열은 1차원 배열들을 요소로 가지는 배열
		// arr[0] = > 1차원 배열을 가지는 배열 변수 (주소값)
		// arr[1] = > 1차원 배열을 가지는 배열 변수 (주소값)
		
		int[][] score = { { 34, 14, 15 }, { 30, 10, 88 }, { 23, 98, 87 }, { 33, 48, 57 } };

		for (int[] tmp : score) {
			//int[] tmp = score[0] => 1차원 배열을 받아주기위하여
			for (int j : tmp) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
