import java.io.IOException;

/**
 * Created by MorAs on 18/05/2017.
 */
public class User {

    private Client connectedClient;

    public User() {
        try {
            connectedClient = new Client();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connected() {

    }
}
