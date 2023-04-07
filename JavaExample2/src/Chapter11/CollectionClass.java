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
		
		System.out.println("최대 값 "+Collections.max(lottoNumbers));
		System.out.println("최소 값 "+Collections.min(lottoNumbers));
		
		Collections.sort(lottoNumbers);
		displayList(lottoNumbers);

		Collections.reverse(lottoNumbers);
		displayList(lottoNumbers);
		
		Collections.shuffle(lottoNumbers);
		displayList(lottoNumbers);
	}

	static public <E> void displayList(List<E> list) {
		for(E num : list) {
			System.out.println(num);
		}
		System.out.println("---------------------");
	}
}
