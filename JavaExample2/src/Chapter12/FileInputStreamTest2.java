package Chapter12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try {
		InputStream in = new FileInputStream("D:\\Test\\test1.txt");

		int i = 0;
		
		while(true) {
			i = in.read();
			if(i==-1) {
				break;
			}
			System.out.print((char)i);
		}
		System.out.println();
		in.close();
		System.out.println("파일을 모두 읽었습니다.");
		
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
