import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    // bad code => 1byte씩 불러오는 방식(느림)
    public static void main(String[] args) throws Exception {

        String copyUrl = "https://img.megabox.co.kr/SharedImg/2023/05/17/a3U7elhifNpQfhxBeOLdFJ5EcuMTtSTF_1100.jpg";

        URL url = new URL(copyUrl);

        InputStream fin = url.openStream();

//        FileInputStream fin =
//                new FileInputStream("C:\\zzz\\joy.jpg");

        FileOutputStream fos =
                new FileOutputStream("C:\\zzz\\copy.jpg");

        System.out.println(fin);

        //2 - 읽고 쓰기
        while(true){

            int data = fin.read();

            if(data == -1){
                break;
            }
            fos.write(data);

        }// end while
    }
}