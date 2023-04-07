package Chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("D:\\Test\\test.zip");
			OutputStream out = new FileOutputStream("D:\\Test\\testcopy.zip");

			// 카피한 파일의 사이즈
			int copyByte = 0;
			
			// 배열에 담기는 데이터의 사이즈
			int byteDataSize = 0;
			
			// 데이터를 담아서 전송할 배열
			byte[] buffData = new byte[1024*2];
			// 2kb 사이즈의 배열 생성, 데이터를 배열에 저장해서 전송해서 읽고 쓴다.
			
			int byteData = 0;

			int count = 0;
			
			while (true) {
				
				//데이터가 buffData넣어짐
				byteDataSize = in.read(buffData); 
				// 전달한 배열에 2kb씩 Byte 데이터를 담고, 몇개 데이터를 전달하는지 개수를 반환
				// 더이상 보낼 데이터가 없으면 -1 반환
				if(byteDataSize == -1) {
					break;
				}
				
				//파일에 데이터를 쓴다.
				
				out.write(buffData, 0, byteDataSize);
				copyByte += byteDataSize; // 복사한 파일의 사이즈 증가 연산
				count++;
			}
			in.close();
			out.close();
			System.out.println("파일을 복사하였습니다." + copyByte + "byte");
			System.out.println(count);
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
