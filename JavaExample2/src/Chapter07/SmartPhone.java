package Chapter07;

public class SmartPhone extends Phone{
	
	// 자식클래스 : 좁은의미, 기능의 확장
	
	String model;
	
	// 미작성시 default 값으로 들어가있음
	// 그러나 부모클래스에서 생성자를 default가 아니라 추가로 작성할경우 부모클래스에서도 default를 명시적으로 작성해줘야한다.
	public SmartPhone() {
		super();
	}
	
	void game() {
		System.out.println(model + "게임을 합니다.");
	}
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		//부모에게 상속받은 요소들
		sp.phoneNum = "010-1111-2222";
		sp.call();
		
		//현재 클래스에서 정의한 요소들
		sp.model = "SAMSUNG GALAXY NOTE 20";
		sp.game();
		
	}

}
