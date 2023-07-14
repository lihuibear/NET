package bear008;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.188.39", 10002);

        BufferedReader br = new BufferedReader(new FileReader("NET\\bear001.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
//            if ("886".equals(line)) {
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //结束
        s.shutdownOutput();

//接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈是" + data);

        br.close();
        s.close();
    }
}

