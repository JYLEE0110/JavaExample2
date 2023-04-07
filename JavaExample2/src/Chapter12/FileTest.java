package Chapter12;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		// File은 경로를 가지고있음
		File file1 = new File("D:\\test\\test-text.txt");
		File dir1 = new File("D:\\tests");

		System.out.println(dir1.exists());

//		dir.exists() => 파일 존재여부 확인
		if ((dir1.exists()) == false) {
			// 폴더가 존재하지않으면 폴더를 생성
			dir1.mkdir();
			System.out.println("d 드라이브에 tests 폴더를 생성");
		} else {
			System.out.println("이미 폴더가 있습니다.");
		}

		if (file1.exists()) {
			System.out.println("파일이 존재합니다.");
		} else {
			System.out.println("파일이 존재하지않습니다.");
		}


		// 기본경로, 공통된 경로를 만들어 놓고
		File dir2 = new File("D:\\test");
		//객체를 넣어줌
		File newFile2 = new File(dir2, "test-text2.txt");

		File newFile = new File("D:\\test", "test-text2.txt");
		
		System.out.println("파일 여부 확인 : " + newFile2.isFile());
		System.out.println("폴더 여부 확인 : " + dir2.isDirectory());
		
		File[] list = dir2.listFiles();
		
		System.out.println("test 폴더 --------------------------");
		
		for(File file : list) {
			if(file.isDirectory()) {
				System.out.print("[DIR] ");
			}else if(file.isFile()) {
				System.out.print("[FILE] ");
			}
			System.out.println(file.getName());
		}
		
		File newPathFile = new File("D:\\test\\abc", "test-text2.txt");
		
		//파일의 이동
		newFile.renameTo(newPathFile);
		System.out.println("파일 이동 완료");
		
	}

}
