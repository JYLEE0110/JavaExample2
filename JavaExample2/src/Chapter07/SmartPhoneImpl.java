package Chapter07;

public class SmartPhoneImpl extends Phone {

	String model;

	public SmartPhoneImpl(String phoneNum, String model) {
		super(phoneNum);
		this.model = model;
	}
	
	void call() {
		super.call();
		System.out.println(model + "으로 이어팟을 이용하여 통화합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhoneImpl phone = new SmartPhoneImpl("010-5420-XXXX", "Note20");
		
		phone.call();
	}
	
}
