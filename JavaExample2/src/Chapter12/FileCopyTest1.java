package Chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("D:\\Test\\test1.txt");
			OutputStream out = new FileOutputStream("D:\\Test\\test1copy.txt");
			int byteData = 0;

			while (true) {
				byteData = in.read();
				if (byteData == -1) {
					break;
				}
				out.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("파일을 복사하였습니다.");

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
