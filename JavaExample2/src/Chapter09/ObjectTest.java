package Chapter09;

class Car {

	String carNo;

	Car(String carNo) {
		this.carNo = carNo;
	}

	@Override
	public boolean equals(Object obj) {// Object 클래스는 최상위 클래스이믈 어떤 타입 가능

		// obj => null => false
		// obj => Car 타입으로 형변환 가능해야한다. obj는 최상위클래스라 Car타입이아닌 System 등 다른 타입이 들어올 수 도 있기에
//		Car car = null; // 참조변수 초기화

		// obj => Car로 형변환 가능한지 확인
//		if (obj != null && obj instanceof Car car) {
//			//
//			car = (Car) obj;
//			if (carNo.equals(car.carNo)) {
//				return true;
//			}
//		}
//		return false;

		if (obj != null && obj instanceof Car c) {
			if (carNo.equals(c.carNo)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}

public class ObjectTest {

	public static void main(String[] args) {

		String car1 = "2023";
		String car2 = "2023";

		String car3 = new String("2023");
		String car4 = new String("2023");

		System.out.println(car1.equals(car2));
		System.out.println(car3.equals(car4));
		
		Car c1 = new Car("2023A001");
		Car c2 = new Car("2023B001");
		Car c3 = c1; // c1의 참조값(주소값)을 c3에 대입 c1.equals(c3) => true
		Car c4 = new Car("2023A001");

		System.out.println(c1.toString());
		System.out.println(c2.toString());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(null));

		System.out.println();
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		System.out.println();
//		
//		System.out.println(c1.equals(c2));

	}

}
