package Chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// 객체 저장
		Person person = new Person("KING", 20);
		String msg = "안녕하세요";
//		int i = 10;

		ObjectOutput outputStream = null;

		try {
			//따로 경로저장안하면 프로젝트 파일에 저장된다.
			FileOutputStream fos = new FileOutputStream("instanceData.ser");

			outputStream = new ObjectOutputStream(fos);

			outputStream.writeObject(person);
			outputStream.writeObject(msg);

			System.out.println("저장");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
