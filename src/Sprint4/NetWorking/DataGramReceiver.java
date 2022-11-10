package Sprint4.NetWorking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataGramReceiver {

    public DataGramReceiver() throws IOException {
        int port = 55555;
        DatagramSocket ds = new DatagramSocket(port);
        byte[] bytes = new byte[256];

        while (true){
            DatagramPacket pack = new DatagramPacket(bytes, bytes.length);
            ds.receive(pack);
            System.out.println(pack.getAddress());
            String s = new String(pack.getData(), 0, pack.getLength());
            System.out.println(s);
        }

    }

    public static void main(String[] args) throws IOException {
        DataGramReceiver test = new DataGramReceiver();
    }
}
