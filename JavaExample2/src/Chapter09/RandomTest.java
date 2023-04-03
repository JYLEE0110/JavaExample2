package Chapter09;

public class RandomTest {

	public static void main(String[] args) {

		int[] numArr = new int[6];

		for (int i = 0; i < numArr.length; i++) {
			int num = (int) (Math.random() * 45) + 1;

			if (numArr[i] != num) {
				numArr[i] = num;
			}
			System.out.println(num);
		}
	}

}
