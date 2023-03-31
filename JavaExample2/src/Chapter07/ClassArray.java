package Chapter07;

public class ClassArray {

	public static void main(String[] args) {

		//상위 타입의 배열 인스턴스 생성
		
		Phone[] phones = new Phone[5];
		
		phones[0] = new AndroidPhone("010-5420-xxxx");
		phones[1] = new Iphone("010-5107-xxxx");
		phones[2] = new Iphone("010-9090-xxxx");
		phones[3] = new Iphone("010-3675-xxxx");
		phones[4] = new AndroidPhone("010-8829-xxxx");
		
		for(Phone phone : phones) {
			phone.call();
			System.out.println();
		}
	}
	
//	public static void callByPhone(Phone phone) {
//		
//	}

}
