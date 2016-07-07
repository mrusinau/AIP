import com.demo.*;
import org.junit.Test;
import static junit.framework.Assert.*;
public class thrdTest {
    @Test
    public void test() throws Exception{
        PreschoolerModel p=new PreschoolerModel("s","a");
        int k, k2;
        for(int i=0;i<100;i++){
            p.setRund(0);
            k=p.getRund();
            p.setRund(2);
            k2 = p.getRund();
            assertTrue(k>=0 && k2<=2);
        }
    }
}
