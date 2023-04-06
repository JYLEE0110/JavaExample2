package Chapter11;

import java.util.HashSet;

public class HastSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		
		set.add("손흥민");
		set.add("박지성");
		set.add("손흥민");
		set.add("박지성");
		set.add("이강인");
		
		System.out.println(set.size());
		System.out.println(set);
		
		for(String name : set) {
			System.out.println(name);
		}
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
	}

}
