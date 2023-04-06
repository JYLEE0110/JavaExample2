package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// List는 인터페이스
		List<Integer> numbers = new ArrayList<Integer>();

		// AutoBoxing
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);

		// 반복자 : Iteraotr<E> => Collection<E> 구현하는 객체들의 전체 참조목적으로 사용
		Iterator<Integer> itr = numbers.iterator();

		System.out.println("Iteraotr를 이용한 전체 참조");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=======================");

		// unBoxing
		for (int n : numbers) {
			System.out.println(n);
		}

		// Collcetion<E> => List<E> = > ArrayList<E>
//		 String 타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조 값을 저장
		ArrayList<String> list = new ArrayList<String>();

		// 인스턴스 저장 => 요소를 저장 , add()
		list.add("이주용");
		list.add(new String("이주용2"));
		list.add(new String("이주용3"));

		// 데이터 참조 : get
		String name = list.get(1);
		System.out.println(name);

		System.out.println(list);

		// 특정위치의 요소 삽입
		list.add(1, "이주용1");

		System.out.println();

		System.out.println(list);

		list.set(0, new String("이주용0"));
		System.out.println(list);

		System.out.println();

		list.remove(new String("이주용0"));
		System.out.println(list);

		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size() - 1));

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " : " + list.get(i).charAt(3));
		}

		System.out.println("--------------------");

		for (String playerName : list) {
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		System.out.println(list);

		if (list.contains("이주용1")) {
			System.out.println("이주용1 화이팅");
		}

		if (list.contains("이주용2")) {
			list.remove("이주용2");
		}

		System.out.println(list);

		// 전체 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}

}
