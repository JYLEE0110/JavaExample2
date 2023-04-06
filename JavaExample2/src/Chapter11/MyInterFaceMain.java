package Chapter11;

public class MyInterFaceMain {

	public static void main(String[] args) {
		
		MyInterface<String, Integer> my = new MyInterFaceImpl<String, Integer>();
		
		System.out.println(my.method1("이주용"));
		System.out.println(my.method2(10));
		
	}

}
