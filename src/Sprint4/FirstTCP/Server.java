package Sprint4.FirstTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){

        try(ServerSocket s = new ServerSocket(55559);
        Socket sock = s.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))){

            String temp;

            while ((temp = br.readLine()) != null){

                System.out.println(temp);


            }


        }
        catch (IOException e){
            throw new RuntimeException();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
    }

}
