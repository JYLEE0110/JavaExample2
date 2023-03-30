package Chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {

		int[][] arr = { { 34, 14, 15 }, { 30, 10, 88 }, { 23, 98, 87 }, { 33, 48, 57 } };

		//행을 반복
		for (int i = 0; i < arr.length; i++) {
			// arr[i] => 반복하면서 각각의 1차원배열
			
			//열의 반복 : 각 1차원 배열의 요소를 출력
//			System.out.print("{ ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "] = " + arr[i][j] + ", ");
//				System.out.print(arr[i][j] + " ");
			}
//			System.out.print("}");
			System.out.println();
		}
	}

}
