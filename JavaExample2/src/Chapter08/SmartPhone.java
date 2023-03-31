package Chapter08;

public class SmartPhone extends Phone {

	String model;
	
	SmartPhone(String phoneNum, String model){
		super(phoneNum);
		this.model = model;
	}
	
	@Override
	void turnOn() {
		super.call();
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");
	}

	public static void main(String[] args) {
		Phone smartPhone = new SmartPhone("010-3333-7777" , "IOS");
		smartPhone.turnOn();
		smartPhone.call();
	}
}
