package Chapter07;

public class Parent {

	int num = 10;
	
	public static void main(String[] args) {
		Child p = new Child();
		
		p.showData(30);
	}
	
}

class Child extends Parent {
	int num = 20;
	
	void showData(int num) {
		System.out.println("상위클래스의 num : " + super.num);
		System.out.println("자식클래스의 num : " + this.num);
		System.out.println("지역클래스의 num : " + num);
	}
}