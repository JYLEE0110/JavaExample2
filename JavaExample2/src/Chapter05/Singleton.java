package Chapter05;

public class Singleton {

//	public static int a;
	// 1. 다른 클래스에서 Singleton 클래스를 이용하여 인스턴스 생성을 막는다!

	private Singleton() {// 생성자만 private로 막고 클래스는 참조변수를 외부에서 써야하므로 pulic class Singleton으로

	}

	// 2. 내부에서 Singleton 클래스로 인스턴스 생성
	private static Singleton s = new Singleton();

	// 3. 내부에서 만들어진 참조값을 외부에서 사용할 수 있도록 참조값을 반환 해주는 메소드
	public static Singleton getInstance() {
//		if (s == null) {
//			s = new Singleton();
//		}
		return s;
	}

	public void printData() {
		System.out.println("데이터를 출력합니다.");
	}
}
