package Chapter09;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date today = new Date();
		
		System.out.println("오늘 날짜 : " + today);
		
		
		Date date = new Date(1587317838379L);
		
		System.out.println("지정 날짜 : " + date);
		
	}

}
