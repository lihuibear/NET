package bear008;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("NET\\bear003.txt"));
        String line;
        while((line=br.readLine())!=null){

            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();
    }
}
