package bear006;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.188.39", 10002);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//        OutputStream is = s.getOutputStream();
//        OutputStreamWriter os = new OutputStreamWriter(is);
//        BufferedWriter bw = new BufferedWriter(os);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}

