package Chapter07;

public class ClassCasting02 {

	public static void main(String[] args) {

		AndroidPhone androidPhone = new AndroidPhone("010-5420-xxxx");
		Iphone iphone = new Iphone("010-5107-xxxx");
		
		callByPhone(androidPhone);
		System.out.println();
		
		callByPhone(iphone);
	}
	
	//매개변수에 다형성을 적용 => 추가적인 메소드 생성이 필요없어진다.
	public static void callByPhone(Phone phone) {
		phone.call();
	}
	
//	다형성사용하지 않을 시 메소드를 계속 오버로딩 해줘야 한다.
//	public static void callByPhone(AndroidPhone p) {
//		p.call();
//	}
//
//	public static void callByPhone(Iphone p) {
//		p.call();
//	}
}
