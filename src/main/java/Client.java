import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by djaes-portable on 17/05/2017.
 */
public class Client {

    private Socket socket;

    public static void main ( String[] args ) throws IOException, InterruptedException {
        Thread.sleep ( 10000 );
        Client client = new Client ();
        client.socket = new Socket ( "127.0.0.1",3000 );

        System.out.println ("CONNECTED TO SERVER");
        PrintWriter writer = new PrintWriter ( client.socket.getOutputStream () );
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( client.socket.getInputStream ()) );

        for (int i = 0;i < 5; i++){
            writer.println ("client " + i );
            writer.flush ();
            System.out.println (reader.readLine ());
        }
    }



}
