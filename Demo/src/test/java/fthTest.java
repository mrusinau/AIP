import com.demo.*;
import org.junit.Test;
import static junit.framework.Assert.*;
public class fthTest {
    @Test
    public void test() throws Exception{
        Model theModel= new Model();
        View theView = new View();
        Controller ctrl =new Controller(theModel, theView);
        PlayerModel gr = ctrl.modele(0);
        PreschoolerModel p=new PreschoolerModel("-","-");
        assertTrue(p.getType()==gr.getType());
    }
}
