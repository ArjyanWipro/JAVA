import java.util.Arrays;
import java.util.Random;

public class DescendingOrder {
    public static void main(String[] args) {
        Random randomNumber=new Random();
        int[] array=new int[10];
        // System.out.println(Arrays.toString(array));

        for (int i=0;i<array.length;i++){
            array[i]=randomNumber.nextInt(1000);
        }
        //Array before sort
        System.out.println("Array before sort "+Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Arrays after accending sort "+Arrays.toString(array));

        int[] formatedArray= new int[array.length];
        int counter=array.length-1;

        for(int j=0;j<array.length;j++){
            formatedArray[j]=array[counter];
            counter--;
        }
        System.out.println("Array in decending order"+Arrays.toString(formatedArray));
    }
}


















