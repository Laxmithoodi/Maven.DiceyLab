import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public  void testBins(){
        Bins bins = new Bins(20,185);

        int expected = bins.getBin(20);

       Assert.assertEquals(expected,0);
    }


    @Test
    public void testBinIncrement(){

        Bins bins = new Bins(20,185);

        int expected = bins.count(20);

        Assert.assertEquals(expected, 1);

    }


}
