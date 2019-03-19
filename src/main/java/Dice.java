public class Dice {

    /**
     * Dice dice = new Dice(2); // for craps
     * Dice dice = new Dice(5); // for yatzee
     * <p>
     * Integer toss = dice.tossAndSum();
     */

    private int diceroll;

    public Dice(int num) {
        this.diceroll = num;
    }


    public int roll(){

        int sumOfRoll =0;

        for (int i = 0; i <diceroll; i++) {
            sumOfRoll = (int) ((6 * Math.random()) +1);

        }
        return sumOfRoll;
    }

}
