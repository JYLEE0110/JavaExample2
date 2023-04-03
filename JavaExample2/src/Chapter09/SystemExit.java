package Chapter09;

import java.util.Scanner;

public class SystemExit {

	public static void main(String[] args) {

		loop();

	}

	public static void loop() {
		Scanner scan = new Scanner(System.in);
		// 메뉴 LOOP
		while (true) {
			System.out.println("메뉴의 번호를 입력 하시오");
			System.out.println("1.입력 2.검색 3.수정 4.삭제");
			System.out.print("메뉴 입력 : >");

			int num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("입력선택");
				System.out.println();
				break;
			case 2:
				System.out.println("검색선택");
				System.out.println();
				break;
			case 3:
				System.out.println("수정선택");
				System.out.println();
				break;
			case 4:
				System.out.println("삭제선택");
				System.out.println();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}
	}
	
}
