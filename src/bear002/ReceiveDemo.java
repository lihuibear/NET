package bear002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] by = new byte[1024];
        DatagramPacket dp = new DatagramPacket(by, by.length);

        ds.receive(dp);

        byte[] data = dp.getData();

        int len = dp.getLength();

        String dataString = new String(data, 0, len);

        System.out.println("数据为：" + dataString);
    }
}
