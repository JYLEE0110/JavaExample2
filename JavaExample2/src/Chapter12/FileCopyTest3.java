package Chapter12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest3 {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("D:\\Test\\test.zip");
			// 필터스트림 사용시에는 기본 스트림이 필요
			BufferedInputStream bin = new BufferedInputStream(in);

			OutputStream out = new FileOutputStream("D:\\Test\\testcopy2.zip");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			// 필터스트림 사용시에는 기본 스트림이 필요
			int byteData = 0;
			int count = 0;
			while (true) {
				byteData = bin.read();
				if (byteData == -1) {
					break;
				}
				bout.write(byteData);
				count++;
			}
			bin.close();
			bout.close();
			System.out.println("파일을 복사하였습니다.");
			System.out.println(count);

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
