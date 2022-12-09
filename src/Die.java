public class Die {
    private final int MAX = 6;
    private int faceValue;

    public Die(){
        faceValue = 1;
    }

    public int roll(){
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    public void setFaceValue(int value){
        faceValue = value;
    }

    public int getFaceValue(){
        if(faceValue >= 1 && faceValue <=6)
        return faceValue;
        else
            System.out.println("The value of the face goes beyond the acceptable values!");
            return 0;
    }

    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }
}
