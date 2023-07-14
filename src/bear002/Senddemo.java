package bear002;

import java.io.IOException;
import java.net.*;

public class Senddemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] by = "lihuibear to panda 我是你111".getBytes();
        int len = by.length;
        InetAddress address = InetAddress.getByName("192.168.188.39");
        int port = 10001;
        DatagramPacket dp = new DatagramPacket(by, len, address, port);

        ds.send(dp);

        ds.close();

    }
}

