public class Roll1000 {
    public static void main(String[] args){
        PairOfDice dice = new PairOfDice();
        int boxcars = 0;
        final int NUM_ROLLS = 10000;
        final int BOXCAR_VALUE = 12;

        for(int i = 0; i < NUM_ROLLS; i++){
            if(dice.rollTheDie() == BOXCAR_VALUE){
                boxcars++;
            }
        }

        System.out.println("Rolled " + NUM_ROLLS + " pairs of dice with " + boxcars + " boxcars.");
    }
}
