package Chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity()); // size반환 default => 16
				
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2);
		System.out.println(sb2.capacity()); // size반환 default => 16 + 5 = 21
		
		// append
		
//		sb2.append("~");
//		sb2.append("JAVA");
		sb2.append(" ~").append(" JAVA"); //자기자신을 반환하기에 channing이 가능함
		
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
		sb2.delete(5,8);
		System.out.println(sb2);
		
		sb2.insert(5, '~');
		System.out.println(sb2);

		sb2.insert(6, "~! ");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		sb2.insert(sb2.length(),"!!");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		sb2.reverse();
		System.out.println(sb2);
	
		String result = new String(sb2);
		
		System.out.println(result);
		
		int num = (int)(Math.random()*100)+1;
		
		System.out.println(num);
		
	}

}
