package bear005;
/*
服务端
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //接收对象
        ServerSocket ss = new ServerSocket(10001);

        //监听客户端连接，返回一个socket
        Socket s = ss.accept();
        InputStream is = s.getInputStream();

        byte[] by = new byte[1024];
        int len = is.read(by);

        String data = new String(by, 0, len);

        System.out.println("服务端:" + data);

        OutputStream os = s.getOutputStream();
        os.write("收到".getBytes());

//        s.close();
        ss.close();
    }
}
