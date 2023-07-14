package bear003;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            byte[] by = new byte[1024];

            DatagramPacket dp = new DatagramPacket(by, by.length);

            ds.receive(dp);

//        byte[] data = dp.getData();
//
//        int len = dp.getLength();
//
//        String dataString = new String(data, 0, len);
//
//
//        System.out.println("数据为："+dataString);
            System.out.println("数据为：" + new String(dp.getData(), 0, dp.getLength()));


        }
        //        ds.close();
    }
}
