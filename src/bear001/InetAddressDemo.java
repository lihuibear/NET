package bear001;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //确定主机
        InetAddress address = InetAddress.getByName("192.168.188.39");
        //得到名称，ip
        String name = address.getHostName();
        String ip = address.getHostAddress();
        //打印
        System.out.println(name);
        System.out.println(ip);
    }

}
