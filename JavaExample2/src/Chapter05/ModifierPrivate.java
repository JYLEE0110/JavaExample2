package Chapter05;

public class ModifierPrivate {

	private String name; //같은 Class 내부에서만 접근가능
	private int age;
	
	public ModifierPrivate(String name, int age){ // 나중에 프레임워크 사용시 default생성자를 사용
		this.name = name;
		this.age = age;
	}
	
	// 은닉된 변수들은 정해진 메소드를 통해서 Access, 설정하게 한다.
	// Getter / Setter => 제어자 public으로
	
	//Getter => return 필요
	public String getName() {
		return this.name;
	}
	
	//Setter => return 값 필요 X
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter => return 필요
	public int getAge() {
		return this.age;
	}
	
	//Setter => return 값 필요 X
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell() {
		System.out.println("Hi! " + age + "세 " + name + " 입니다.");
	}

}
