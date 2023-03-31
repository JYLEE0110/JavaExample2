package Chapter08.phone;

public class Main {

	public static void main(String[] args) {

		// Phone인터페이스에 있는 static 상수에 접근
//		System.out.println(Phone.PHONE_NUM_0);
//		System.out.println(Phone.PHONE_NUM_1);
//		System.out.println(Phone.PHONE_NUM_2);
//		System.out.println(Phone.PHONE_NUM_3);
//		System.out.println(Phone.PHONE_NUM_4);
//		System.out.println(Phone.PHONE_NUM_5);
//		System.out.println(Phone.PHONE_NUM_6);
//		System.out.println(Phone.PHONE_NUM_7);
//		System.out.println(Phone.PHONE_NUM_8);
//		System.out.println(Phone.PHONE_NUM_9);

//		Phone phone = null; // = new 구현한 클래스();
//		// 1. 전원을 키고
//		phone.turnOn();
//		// 2. 통화
//		phone.call();
//		// 3. 전원을 끈다.
//		phone.turnOff();
		
		Phone phone2 = new SmartPhone2();
		///////////////////////
		// 1. 전원을 키고
		phone2.turnOn();
		// 2. 전화를걸고
		phone2.call();
		// 3. 게임을 한다.
		((SmartPhone2)phone2).playGame(); // Phone클래스에는 playGame이 없음
		// 4. 전원을 끈다.
		phone2.turnOff();
	}

}
