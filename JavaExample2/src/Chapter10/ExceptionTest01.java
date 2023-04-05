package Chapter10;

import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("프로그램을 시작 합니다.");
		System.out.println("정수를 입력하시오 >");
		int num1 = scan.nextInt();

		System.out.println("두번쨰 정수를 입력하시오>");
		int num2 = scan.nextInt();

//		// if를 이용해서 예외처리
//		if (num2 == 0) {
//			System.out.println("0으로 나눌 수 는 없습니다.");
//			System.out.println("프로그램을 종료합니다.");
//			return; // main 메소드 종료 => 프로그램 종료
//		}
//		
		try {
			System.out.println(num1 / num2);
			System.out.println("나눗셈의 연산이 정상적으로 처리되었습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 는 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
