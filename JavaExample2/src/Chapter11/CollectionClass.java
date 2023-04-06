package Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionClass {

	public static void main(String[] args) {
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i<6; i++) {
			int n = new Random(System.nanoTime()).nextInt(45)+1;
			lottoNumbers.add(n);
		}
		displayList(lottoNumbers);
		
		System.out.println("최대값 "+Collections.max(lottoNumbers));
		System.out.println("최소값 "+Collections.min(lottoNumbers));
	}

	static public <E> void displayList(List<E> list) {
		System.out.println("---------------------");
		for(E num : list) {
			System.out.println(num);
		}
	}
}
