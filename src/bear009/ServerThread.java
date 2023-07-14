package bear009;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    private static int count =0;//设置为静态变量，达到多个[i]的命名


    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));


//            File file = new File("NET\\bear[" + count + "].txt");
//            if (file.exists()) {
//                count++;
//                file = new File("NET\\bear[" + count + "].txt");
//            }
            //只会2个
            File file = new File("NET\\bear[" + count + "].txt");
            count++;

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {

                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("上传成功");
            bwServer.newLine();
            bwServer.flush();


            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
