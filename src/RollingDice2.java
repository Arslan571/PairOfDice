public class RollingDice2 {
    public static void main(String[] args){
        PairOfDice dice = new PairOfDice();
        System.out.println("Rolling the dice...");
        dice.rollTheDie();

        System.out.println("getting first die value " +
                dice.getFirstValue());
        System.out.println("getting second die value " +
                dice.getSecondValue());
        System.out.println("sum of value " + dice.toString() + ".");

        System.out.println("setting values to maximum number of die.");
        dice.initValue(6);
        dice.nextValue(6);
        System.out.println("value is " + dice.toString() + "!");

    }
}
