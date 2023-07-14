package bear003;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Senddemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            byte[] by = line.getBytes();

            DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("192.168.188.88"), 10086);

            ds.send(dp);
        }
        ds.close();
    }
}
