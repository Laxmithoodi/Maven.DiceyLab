public class Simulation {

    private int numOfDice;
    private int numOfThrows;
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);
        Bins bin1 = sim.runSim();
        sim.print(bin1);

    }


    public Simulation(int numOfDice, int numOfThrows){
        this.numOfDice = numOfDice;
        this.numOfThrows = numOfThrows;

    }

    public int getTotal(Bins binStore){
        int tot = 0;
        for(int i= binStore.getDiceNum(); i <= binStore.getMaxVal(); i++){

            tot += binStore.getBin(i);
        }

        return tot;
    }

    public Bins runSim(){
        Dice dice = new Dice(2);
        Bins binStore = new Bins(2,12);

        for(int i = 0; i < numOfThrows ; i++){
            int output = dice.roll();
            binStore.count(output);
        }
        return binStore;

    }

    public void print(Bins inBin){
        StringBuilder build = new StringBuilder();
        int binTotal = getTotal(inBin);
        StringBuilder starbuilder = new StringBuilder();


        String totalSims = String.format("Simulation of %d dice rolled %d times \n",
                + numOfDice, numOfThrows);
        build.append(totalSims);

        for(int i = inBin.getDiceNum(); i <= inBin.getMaxVal(); i++){
            int currentVal = inBin.getBin(i);

            float percent = (float)currentVal/binTotal;

            for(int q = 0; q <= (int)(percent); q++){
                starbuilder.append("*");

            }
            String finalOutput = String.format(" %3d : %7d %.2f %s \n", +
                    i, currentVal, percent, starbuilder);

            build.append(finalOutput);
        }

        System.out.println(build);
    }


}
