package bear009;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);


        while (true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }


    }
}
