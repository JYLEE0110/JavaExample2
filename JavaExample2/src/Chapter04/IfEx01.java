package Chapter04;

import java.util.*;

public class IfEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		int score; // 시험점수 데이터 
		
		System.out.print("Input your score! : ");
		score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println();
		/////////////////////////////
		
		int num;
		
		System.out.print("Input number : ");
		num = scan.nextInt();
		
		String result;
		
		result = num%2==0 ? "짝수" : "홀수";
		
		System.out.println(result);
	}

}
