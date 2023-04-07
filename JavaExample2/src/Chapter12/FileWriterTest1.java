package Chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "String";
		char ch = 'A';
		char[] charArr = {'B', 'C'};
		
		
		try {
		FileWriter out = new FileWriter("D:\\Test\\test-text.txt");
		out.write(str);
		out.write(charArr);
		out.write(ch);
		
		out.close();
		System.out.println("파일 쓰기 완료");
		}catch (IOException e) {
			System.out.println(e);
		}
	}

}
