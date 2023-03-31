package Chapter07;

public class AndroidPhone extends Phone {

	public AndroidPhone(String phoneNum) {
		super(phoneNum);
	}

	@Override
	void call() {
		super.call();
		System.out.println("Android 폰으로 통화");
	}
	
}
