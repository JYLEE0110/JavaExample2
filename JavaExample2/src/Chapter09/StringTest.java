package Chapter09;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");

		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println(str1.equals(str3));

		// 특정 타밉의 대인'
		String str4 = "" + 1;
		String str5 = String.valueOf(1);
		String str6 = new String();

		System.out.println(str5.toString());
		System.out.println();

		String str = "Hello~";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		// 역순
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// compareTo() 정렬시에 사용
		String num1 = "ABC";
		String num2 = "ABCD";

		// num1이 num2보다 작냐? True일시 양수 False일시 음수 같으면 0
		System.out.println(num1.compareTo(num2));

		System.out.println("---------------");
		// 문자열을 붙인다! => "" + "" => concat(String s)
		System.out.println(str.concat("HH"));

		System.out.println("---------------");
		// 문자열에 특정 문자열을 포함여부 확인 => boolean
		System.out.println(str.contains("lo"));
		System.out.println(str.contains("b"));

		System.out.println("---------------");
		String file1 = "phone.jpg";
		String file2 = "java.pdf";

		if (file1.endsWith(".jpg")) {
			System.out.println("업로드 가능한 파일 확장자입니다.");
		} else {
			System.out.println("확장자가 아닙니다.");
		}
		
		System.out.println("---------------");
		// equals => 저장하고있는 문자열 비교
		System.out.println(str.equals("heelo"));
		System.out.println(str.equals("Hello~"));
		
		System.out.println("---------------");
		//문자열의 사이즈 체크 : isEmpty() => str.length()
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println("---------------");
		// 문자열의 개수
		System.out.println(str.length());
		
		System.out.println(str);
		System.out.println(str.replace('~', '!'));
		System.out.println(str.replace("Hello", "JAVA"));
		System.out.println(str);
		
		System.out.println("---------------");
		
		String url = "https://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("https://"));
		
		String domain = "https://localhost:80";
		
		System.out.println(url.substring(domain.length()));
	}

}
