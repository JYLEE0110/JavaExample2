package Chapter05;

public class ModifierProtected {// public 접근제어자를 안써주면 default가 되므로 Chapter05.other패키지 안에있는 ModifierProtectedExtedns 클래스 import구문에서 오류가 발생 

	protected String name;
	protected int age;
	
	protected void tell() {
		System.out.println("HI " + age + "살 " + name + " 입니다.");
	}
}
