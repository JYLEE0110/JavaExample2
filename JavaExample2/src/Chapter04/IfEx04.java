package Chapter04;

public class IfEx04 {

	public static void main(String[] args) {

		int num = 0;
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else {
			if(num<0) {
				System.out.println("음수입니다.");
			}else {
				System.out.println("0입니다.");
			}
		}
	}

}
