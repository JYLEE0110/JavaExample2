package Chapter04;

public class IfEx03 {

	public static void main(String[] args) {

		// 특정 숫자의 판별 : 양수, 음수, 0
		
		int num = 0;
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
	}

}
