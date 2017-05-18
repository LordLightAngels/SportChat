
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by djaes-portable on 17/05/2017.
 */
public class Server {

    private ServerSocket serverSocket;

    public static void main ( String[] args )throws IOException {
        Server server = new Server ();
        server.serverSocket = new ServerSocket ( 3000 );
        while (true){
            Socket client = server.serverSocket.accept ();
            System.out.println ("CONNECTED");

            PrintWriter writer = new PrintWriter ( client.getOutputStream ());
            BufferedReader reader = new BufferedReader ( (new InputStreamReader ( (client.getInputStream ()) )) );

            String recieved = reader.readLine ();
            writer.println("5/5 : "+ recieved );
            writer.flush ();
        }

    }
}
