package bear004;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

        byte[] by = new byte[1024];

        int len = is.read(by);

        String data = new String(by, 0, len);

        System.out.println(data);

        s.close();
        ss.close();
    }
}
