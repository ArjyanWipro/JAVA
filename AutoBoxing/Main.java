package AutoBoxing;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Double wrapperValue=doubleWraperClass();
        System.out.println("wrapperValue= "+wrapperValue+" Class name= "+wrapperValue.getClass().getSimpleName() );

        double primitiveData= doublePrimitive();
        System.out.println("primitiveData= "+primitiveData);

        var list=List.of(10,25,30,50);
        System.out.println(list);

    }

    private static ArrayList<Integer> getList(int... input){
        ArrayList<Integer> wrapperClass= new ArrayList<>();
        for (int i : input) {
            wrapperClass.add(i);
        }

        return wrapperClass;
    }

    public static Double doubleWraperClass(){
        return Double.valueOf(120.0);
    }

    public static double doublePrimitive(){
        return 100.00;
    }

}
