package Chapter05;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance(); // printData 메소드 주소값
//		s = new Singleton(); // 외부에서 인스턴스 생성이 불가.

//		Singleton.s =
		
		s.printData();
		Singleton s1 = Singleton.getInstance(); // printData 메소드 주소값
		Singleton s2 = Singleton.getInstance(); // printData 메소드 주소값
	}

}
