package Chapter11;

import Chapter05.phone.SmartPhone;
import Chapter07.Phone;

public class GenericMethodByType2 {

	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요 " + t.toString());
	}

	public static void main(String[] args) {
//		GenericMethodByType2 byType = new GenericMethodByType2();
//		
//		Phone p = new SmartPhone("010-11","IOS");
//		byType.<Phone>introduce(p);
	}

}
