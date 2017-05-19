import org.junit.Test;

/**
 * Created by MorAs on 18/05/2017.
 */
public class MainTest {

    @Test
    public void shouldBeConected() {
        Server chanFootball = new Server();
        User userTest = new User();
        userTest.connected();
    }

}
