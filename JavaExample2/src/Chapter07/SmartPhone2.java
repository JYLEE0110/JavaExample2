package Chapter07;

public class SmartPhone2 extends Phone {

	String model;

	// 상위클래스에 매개변수가 있는 생성자가 있다면 상위클래스의 맴버를 초기화 할 데이터를 받아서
	// 상위클래스의 생성자를 호출해주어야 한다.
	// 현재 클래스의 맴버를 초기화 한다.

	public SmartPhone2(String phoneNum, String model) {
		// 상위클래스의 생성자를 호출
		//super.phoneNum = phoneNum 과같이 자식클래스에서 부모클래스 생성자를 직접 초기화를 해주지않고 부모클래스에서 하게 끔 해줌.
		super(phoneNum);
		// 현재 클래스 인스턴스변수의 초기화

		this.model = model;
	}

	void game() {
		super.call();
		System.out.println(model + "게임을합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhone2 smartPhone = new SmartPhone2("010-222-444", "IOS");
		
		smartPhone.game();
	}

}
