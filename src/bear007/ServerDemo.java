package bear007;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);

        Socket s = ss.accept();
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("NET\\bear001.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();


        }
        bw.close();
        ss.close();
    }
}
