import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {
    // bad code exception
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.48", 8080);

        System.out.println(socket);

        // 보내려면 OutputStream이 필요
        OutputStream out = socket.getOutputStream();

        FileInputStream fin = new FileInputStream("C:\\zzz\\joy.jpg");

        // 계속 읽어서 계속 보내기
        while(true){
            // int 1byte 데이터
            int data = fin.read();

            // 데이터 전송
            out.write(data);

            // -1 더이상 읽을 데이터가 없다면
            if(data == -1){
                break;
            }
        } // end while

        // 사용했던 자원을 정리
        fin.close();
        out.close();
        socket.close();


//        out.write(65);
//        out.write(66);
//        out.write(67);

    }

}
