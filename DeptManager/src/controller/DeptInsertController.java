package controller;

import java.sql.SQLException;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptInsertService;

public class DeptInsertController implements Controller {

	DeptInsertService insertService;

	private DeptInsertController() {
		this.insertService = DeptInsertService.getInstance();
	}

	private static DeptInsertController controller = new DeptInsertController();
	public static DeptInsertController getInstance() {
		return controller;
	}
	
	public void process() {
		// 1. 사용자 입력 처리 -> Dept 타입의 객체를 반환
		Dept dept = inputDept();

		// 2. Dept 객체를 Service로 전달 => 결과 반환(1 or 0) => insert라 한행씩 추가하기에
		int result = insertService.insertDept(dept);

		// 3. 결과 출력

		printData(result);
	}

	// service 갔다옴 반환값 result(1 or 0)
	private void printData(int result) {
		if (result > 0) {
			System.out.println("입력되었습니다.");
		} else {
			System.out.println("입력 실패.(입력 값을 확인 후 다시 입력해주세요).");
		}
	}

	// 사용자 입력 처리 화면(View)
	private Dept inputDept() {

		System.out.println("부서 정보 입력을 시작합니다.");
		System.out.println("부서 번호를 입력하세요. >> ");
		int deptno = Integer.parseInt(DeptManagerMain.scan.nextLine());
		System.out.println("부서이름을 입력하세요.>>>");
		String dname = DeptManagerMain.scan.nextLine();
		System.out.println("부서 위치를 입력하세요. >>>");
		String loc = DeptManagerMain.scan.nextLine();

		return new Dept(deptno, dname, loc);
	}
}
