package Sprint4.MultiCast;

import java.io.IOException;
import java.net.*;

public class MulticastReceiver {

    public MulticastReceiver() throws IOException {
        int port = 55555;
        MulticastSocket ms = new MulticastSocket(port);
        byte[] bytes = new byte[256];
        InetAddress ip1 = InetAddress.getByName("234.234.234.234");

        InetSocketAddress group = new InetSocketAddress(ip1, port);
        NetworkInterface netIf = NetworkInterface.getByName("wlan5");

        ms.joinGroup(group,netIf);

        while (true){
            DatagramPacket pack = new DatagramPacket(bytes, bytes.length);
            ms.receive(pack);
            System.out.println(pack.getAddress());
            String s = new String(pack.getData(), 0, pack.getLength());
            System.out.println(s);
        }

    }

    public static void main(String[] args) throws IOException {
        MulticastReceiver test = new MulticastReceiver();
    }
}
