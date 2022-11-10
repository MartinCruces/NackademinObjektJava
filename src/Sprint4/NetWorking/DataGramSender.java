package Sprint4.NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DataGramSender {

    public DataGramSender() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        InetAddress ip1 = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket ds = new DatagramSocket();

        String message;

        while((message = br.readLine()) != null ){

            byte[] bytes = message.getBytes();
            DatagramPacket pack = new DatagramPacket(bytes, bytes.length, ip1, toPort);
            ds.send(pack);
        }



    }
}
