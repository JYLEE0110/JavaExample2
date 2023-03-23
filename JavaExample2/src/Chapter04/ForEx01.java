package Chapter04;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		for(int i = 1; i<10; i++) {
		//			for(int j = 2; j<10;j++) {
		//				System.out.printf("%d * %d = %d\t", j, i, i*j);
		//			}
		//			System.out.println();
		//		}
		int sum = 0;
		int cnt = 0;
		while(true) {
			
			cnt++;
			sum+=cnt;
			
			if(sum > 1000) {
				cnt = cnt-1;
				sum = sum-cnt;
				break;
			}
			
			
		}
		System.out.println(cnt);
		System.out.println(sum);


		//		for(int i = 1; i < 45; i++) {
		//			sum += i;
		//		}
		//		System.out.println(sum);

	}
}
