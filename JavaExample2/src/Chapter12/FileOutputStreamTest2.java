package Chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {

		try {
			OutputStream out = new FileOutputStream("D:\\Test\\test1.txt");
			
			String str = "HI ~ !!";
			byte[] arr = str.getBytes();
			out.write(arr);
			out.close();
			System.out.println("파일 데이터 쓰기 성공");
		} catch (FileNotFoundException e) {
			//FileNotFoundException은 IOException의 자식 클래스라 안써줘도 된다.
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
