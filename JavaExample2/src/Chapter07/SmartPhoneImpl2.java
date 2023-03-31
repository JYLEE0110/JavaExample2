package Chapter07;

public class SmartPhoneImpl2 extends Phone {

	String model;

	public SmartPhoneImpl2(String phoneNum, String model) {
		super(phoneNum);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		 //model은 상위타입에는 없어서 다형성을 사용할 시 접근을 못하지만 오버라이딩을 통해 간접적으로 활용할 수 있다.
		System.out.println(model + "으로 이어팟을 이용하여 통화합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	public static void main(String[] args) {
		
		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는 것
		Phone p = new SmartPhoneImpl2("010-5420-XXXX", "Note20");
		
		// 상위타입에도 call이있고 하위타입에도 call이 오버라이딩 되어있으므로 하위타입의 call이 호출된다.
		p.call(); // 하위타입 인스턴스에 정의되어 있는 오버라이딩된 call() 호출된다.
		
//		p.playMusic(); // 상위클래스에는 없는 메소드 이므로 호출이 안된다.
		
		//p
		SmartPhoneImpl2 p2 = (SmartPhoneImpl2)p;
		
		p2.playMusic();
		
//		System.out.println(p2.model);
		
		
		
	}
	
}
