import com.demo.*;
import org.junit.Test;
import static junit.framework.Assert.*;
public class secTest {
    @Test
    public void test() throws Exception{
        Model theModel= new Model();
        View theView=new View();
        Controller ctl =new Controller(theModel, theView);
        PlayerModel gr;
        PlayerView gv;
        PlayerCtrl gc, gc2;

        gr=new StudentModel("test","test");
        gv=new StudentView();
        gc=ctl.kontrole(2,gr, gv);
        gc2=new StudentCtrl(gr,gv);
        assertTrue(gc.getClass()==gc2.getClass());

    }
}
