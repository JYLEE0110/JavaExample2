package Chapter12;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest1 {

	public static void main(String[] args) {

		char[] cBuf = new char[2];
		int readCnt = 0;

		int cBufSize = 0;
		
		int count = 0;
		
		try {
			Reader in = new FileReader("D:\\Test\\test-text.txt");

			while (true) {

				readCnt = in.read(cBuf);

				if (readCnt == -1) {
					break;
				}
				System.out.print(cBuf);
				count++;
			}
			System.out.println();
			System.out.println(count);
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
