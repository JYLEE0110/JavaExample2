package Chapter08;

public abstract class Phone {

	String phonNum;
	
	public Phone(String phoneNum){
		this.phonNum = phoneNum;
	}
	
	void call() {
		System.out.println(phonNum + "에서 전화를 겁니다.");
	}
	
	abstract void turnOn();
	
}
