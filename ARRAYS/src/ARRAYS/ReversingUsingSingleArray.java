import java.util.Arrays;
import java.util.Scanner;

public class ReversingUsingSingleArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");

        int arrayLength = sc.nextInt();
        reverseArray(arrayCreation(arrayLength));
        sc.close();
    }

    private static int[] arrayCreation(int arraySize) {
        Scanner sc = new Scanner(System.in);
        int[] defaultArray = new int[arraySize];
        sc.close();

        for (int i = 0; i < defaultArray.length; i++) {
            System.out.println("Enter value for index-> " + i);
            defaultArray[i] = sc.nextInt();
        }
        System.out.println("Original array is "+Arrays.toString(defaultArray));
        return defaultArray;
        
    }

    private static void reverseArray(int[] array) {
        int totalLengthOfArray = array.length;
        int miidleElement = totalLengthOfArray / 2;

        for (int i = 0; i < miidleElement; i++) {
            int temp = array[i];
            //Doubt why we need "i" in the array
            array[i] = array[totalLengthOfArray-i - 1];
            array[totalLengthOfArray-i - 1] = temp;
        }

        System.out.println("Reversed Array is "+Arrays.toString(array));
    }
}
