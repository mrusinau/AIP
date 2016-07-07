import com.demo.*;
import org.junit.Test;
import static junit.framework.Assert.*;
public class frthTest {

    @Test
    public void test() throws Exception{
        Singleton singel = Singleton.getInstance();
        String str = "Hello World!\n";
        assertEquals(singel.showMessage(), str);
    }

}
