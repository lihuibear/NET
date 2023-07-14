package bear005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
客户端
*/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的对象shock
        Socket s = new Socket("192.168.188.39", 10001);

        OutputStream os = s.getOutputStream();

        os.write("你好bear".getBytes());

        InputStream is = s.getInputStream();

        byte[] by = new byte[1024];
        int len = is.read(by);
        String data = new String(by, 0, len);
        System.out.println("客户端：" + data);

//        os.close();
//        is.close();
        s.close();
    }
}
