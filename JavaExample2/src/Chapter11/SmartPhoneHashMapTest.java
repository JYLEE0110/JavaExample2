package Chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<String, SmartPhone>();
		
		SmartPhone p = new SmartPhone("Spring","010-5420-XXXX");
		hashMap.put("ver",p);
		
		SmartPhone p2 = new SmartPhone("Sprin","010-5420-XXXX");
		hashMap.put("program",p2);
		
		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("program"));// key값이 없으므로 null출력
		
		
		Set<String> keySet = hashMap.keySet();
		
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}
		
	}

}
