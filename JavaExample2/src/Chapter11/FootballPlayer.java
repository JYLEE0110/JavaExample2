package Chapter11;

// 축구선수의 정보를 저장하는 클래스 : 축구선수 데이터저장 -> 인스턴스 생성 -> 배열 -> List
public class FootballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer() {
		//기본 생성자 => 나중에 set으로 이름을 넣어줄 상황이 있을 수도 있기에
	}

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + number + "번\t" + team + "\t" + age + "세";
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)", team, name, number, age);
	}
//	@SuppressWarnings("unlikely-arg-type")
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//
//		if (obj != null && obj instanceof FootballPlayer p) {
//
//			p = (FootballPlayer) obj;
//
//			if (name.equals(p.getName()) && name.equals(p.getTeam()) && name.equals(p.getAge())) {
//				result = true;
//			}
//
//		}
//		return result;
//	}

}
