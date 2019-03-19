import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {


    @Test
    public void simTest(){

        Simulation sim = new Simulation(1,1);

        Bins actual = sim.runSim();

        Assert.assertNotNull(actual);


    }
    @Test
    public void simTestTotal(){

        Simulation sim = new Simulation(1,1);

        Bins actual = sim.runSim();
        int total = sim.getTotal(actual);
        Assert.assertNotNull(total);


    }
}
