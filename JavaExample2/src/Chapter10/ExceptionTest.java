package Chapter10;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			Class.forName("Example");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못하였습니다.");
			e.printStackTrace();
		}

		int[] numbers = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			numbers = new int[-10];
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 사이즈가 음수 입니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		String str = null;
		try {
			str.trim();
		} catch (NullPointerException e) {
			System.out.println("참조변수 값이 Null값 입니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
