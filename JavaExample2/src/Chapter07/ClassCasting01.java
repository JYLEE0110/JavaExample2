package Chapter07;

public class ClassCasting01 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-5420-XXXX");
		
		Phone phone = new AndroidPhone("11");
		Phone p = new Iphone("222");
		
//		Phone phone1 = androidPhone; //하위타입의 참조변수를 상위타입으로 변경은 생략 가능
//		AndroidPhone phone3 = (AndroidPhone)phone;
//		AndroidPhone phone4 = (AndroidPhone)p; // new Iphone("222") => 오류
//		Iphone iphone = null;
		
		if(p instanceof Iphone) {
			Iphone iphone = (Iphone)p;			
			iphone.call();
		}else if(p instanceof AndroidPhone) {
			AndroidPhone android = (AndroidPhone)p;
			android.call();
		}
		
	}

}
