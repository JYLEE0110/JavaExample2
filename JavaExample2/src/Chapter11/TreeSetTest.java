package Chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		
		Set<SmartPhone> phones = new TreeSet<SmartPhone>();
		
		phones.add(new SmartPhone("Spring", "010-9999-9999"));
		phones.add(new SmartPhone("King", "010-0000-0000"));
		phones.add(new SmartPhone("Adam", "010-1111-1111"));
		phones.add(new SmartPhone("Scott", "010-3333-3333"));
		phones.add(new SmartPhone("Smith", "010-0000-0000"));
		
		for(SmartPhone sp : phones) {
			System.out.println(sp);
		}
		
		Set<SmartPhone> phones2 = new HashSet<SmartPhone>();

		phones2.add(new SmartPhone("손흥민", "010-1234-5678"));
		phones2.add(new SmartPhone("박지성", "010-3333-7777"));
		phones2.add(new SmartPhone("이강인", "010-1235-5678"));
		phones2.add(new SmartPhone("가나다", "010-1236-5678"));
		phones2.add(new SmartPhone("나다라", "010-1237-5678"));

//		for (SmartPhone sp : phones2) {
//			System.out.println(sp);
//		}
		
		//compareTo의 정렬순서
		phones2.stream().sorted().forEach(System.out::println);
		
	}

}
