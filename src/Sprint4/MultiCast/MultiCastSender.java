package Sprint4.MultiCast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastSender {

    public MultiCastSender() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        InetAddress ip1 = InetAddress.getByName("234.234.234.234");
        int toPort = 55555;
        MulticastSocket ms = new MulticastSocket();

        String message;

        while((message = br.readLine()) != null ){

            byte[] bytes = message.getBytes();
            DatagramPacket pack = new DatagramPacket(bytes, bytes.length, ip1, toPort);
            ms.send(pack);
        }



    }
}
