import com.demo.*;
import org.junit.Test;
import static junit.framework.Assert.*;
public class fstTest {
    @Test
    public void test() throws Exception{
        PlayerModel theModel = new StudentModel("-","-");
        StudentView theView = new StudentView();
        Timer timer = new Timer(theModel, theView);
        assertEquals(timer.ret(), theModel.limit);
    }
}