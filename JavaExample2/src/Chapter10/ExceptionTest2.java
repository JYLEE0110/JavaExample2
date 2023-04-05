package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("프로그램을 시작 합니다.");

		try {
			// 1. 예외발생 지점을 예상하여 try 구문으로 감쌈
			System.out.println("정수를 입력하시오 >");
			num1 = scan.nextInt();

			System.out.println("두번쨰 정수를 입력하시오>");
			num2 = scan.nextInt();

			// 2. 예외발생 시 아래문장은 실행하지 않고 catch 문으로 이동
			System.out.println(num1 / num2);
			System.out.println("나눗셈의 연산이 정상적으로 처리되었습니다.");
			
		} catch (ArithmeticException e) {
			// 3. 동일한 예외일 시 실행
			System.out.println("0으로 나눌 수 는 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하시오!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} catch (Exception e) {
			// 3. Exception은 모든 예외의 조상이므로 마지막에 넣어 줌
			System.out.println("예외발생!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			//try 블럭으로 진입하면 무조건 실행
			System.out.println("무조건 실행 하는 구문입니다.");
		}
		// 4. 실행 후 종료
		System.out.println("프로그램을 종료합니다.");
	}

}
