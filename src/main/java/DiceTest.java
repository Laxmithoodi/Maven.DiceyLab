
import org.junit.Assert;

import org.junit.Test;



public class DiceTest {

    @Test
    public void testDiceCraps() {

        Dice dice = new Dice(2);
        int expected = 6;
        int actual = dice.roll();

       Assert.assertEquals(expected, actual);

    }
    @Test
    public void testYahtzee(){
        Dice dice = new Dice(5);
        int expected = 2;
        int actual = dice.roll();

        Assert.assertEquals(expected, actual);
    }




}

