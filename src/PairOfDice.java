public class PairOfDice {
    private Die die1 = new Die();
    private Die die2 = new Die();

    public void initValue(int value){
        die1.setFaceValue(value);
    }

    public void nextValue(int value){
        die2.setFaceValue(value);
    }

    public int getFirstValue(){
        return die1.getFaceValue();
    }

    public int getSecondValue(){
        return die2.getFaceValue();
    }

    public int getValue(){
        return getFirstValue() + getSecondValue();
    }

    public int rollTheDie(){
        return die1.roll() + die2.roll();
    }

    public String toString(){
        String result = Integer.toString(getValue());
        return result;
    }
}
