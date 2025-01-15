package GenericsExtra;

public class bitsStudent extends Student {
    private double percentCompleted;

    public bitsStudent(){
        percentCompleted=randomNumber.nextDouble(0,100.001);
    }

    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(),percentCompleted);
    }

    public double getPercentCompleted() {
        return percentCompleted;
    }
    
}
