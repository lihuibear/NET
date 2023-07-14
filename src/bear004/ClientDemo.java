package bear004;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.188.39",10001);

        OutputStream os = s.getOutputStream();
        os.write("nihao".getBytes());
        s.close();
    }
}
