package Chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String grade = "manager"; // 권한 순 admin, manager, user
		
		switch (grade) {
		case "admin":
			System.out.println("삭제 기능 사용가능");
		case "manager":
			System.out.println("쓰기 기능 사용가능");
		default:
			System.out.println("읽기 기능 사용가능");
		}
	}

}
