package Chapter04;

public class SwitchEx01 {

	public static void main(String[] args) {

		int score = 59;
		
		switch(score/10) {
		
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
		}
		
		
	}

}
