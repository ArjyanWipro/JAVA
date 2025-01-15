import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int input=sc.nextInt();
        reverseArray(input);
        sc.close();
    }

    private static void reverseArray(int arrayLength){
        Scanner sc=new Scanner(System.in);
        int [] normalArray= new int[arrayLength];

        for(int i=0;i<arrayLength;i++){
            System.out.println("Enter array element for "+i);
            normalArray[i]= sc.nextInt();
        }
        System.out.println("Normal array is "+Arrays.toString(normalArray));

        int[] reverseArray= new int[normalArray.length];
        int counter=normalArray.length-1;

        for(int j=0;j<normalArray.length;j++){
            reverseArray[j]=normalArray[counter];
            counter--;
        }

        System.out.println("Reverse array is "+Arrays.toString(reverseArray));
        sc.close();       
    }
}
