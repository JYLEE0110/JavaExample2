package Chapter07;

public class Iphone extends Phone {

	public Iphone(String phoneNum) {
		super(phoneNum);
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("Iphone으로 통화");
	}
}
