package Chapter10;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {

		int score;

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 하시오");

		score = scan.nextInt();

		try {
			if (!(score >= 0 && score <= 100)) {
				//사용자 정의 예외처리
				BadInputException e = new BadInputException();
				throw e;
			}
		} catch (BadInputException e) {
			System.out.println("1~100사이의 점수만 입력 하시오.");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
