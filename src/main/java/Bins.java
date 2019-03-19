import java.util.HashMap;

public class Bins {

    private int diceNumRoll;
    private int maxVal;
    private static HashMap<Integer, Integer> binStore = new HashMap<Integer, Integer>();

    public Bins(int diceNumRoll, int maxVal) {
        this.diceNumRoll = diceNumRoll;
        this.maxVal = maxVal;

        for(int i= diceNumRoll; i<=maxVal; i++){
            binStore.put(i,0);
        }

    }

    public int getBin(int binNum) {
        return binStore.get(binNum);
    }

    public int count(int binNum){
        int currNum = getBin(binNum);
        currNum+=1;
        binStore.put(binNum, currNum);
        return binStore.get(binNum);
    }

    public int getMaxVal() {
        return maxVal;
    }

    public int getDiceNum(){
        return diceNumRoll;
    }

}

