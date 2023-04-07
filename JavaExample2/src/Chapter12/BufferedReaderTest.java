package Chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader in = null;
		String str = null;
		int count = 0;

		// Reader 객체 생성
		try {
			in = new BufferedReader(new FileReader("D:\\test\\test-text2.txt"));

			while(true) {
				str = in.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
				count++;
			}
			System.out.println("==============================================");
			System.out.println("파일 읽기완료");
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}

}
