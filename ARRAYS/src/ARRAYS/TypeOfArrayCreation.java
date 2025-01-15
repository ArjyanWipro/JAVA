import java.util.Arrays;
import java.util.Random;

public class TypeOfArrayCreation {

    public static void main(String[] args) {
        // // ananomoyous Array
        // int[] arr0= {1,2,3,4,5,};
        // System.out.println(arr0[1]);

        // // Array object
        // int[] arr1= new int[10];
        // arr1[0]=10;
        // arr1[2]=12;
        // arr1[3]=13;
        // System.out.println(arr1[3]);

        // // Array object with initialization
        // int[] arr2= new int[]{1,2,3,4,5,6};
        // System.out.println(arr2[4]);

        // int[] arr3= new int[10] ;
        // for(int i=0;i<arr3.length;i++){
            
        //     System.out.print(arr3[i]+"  ");
        // }
        // System.out.println(arr3[arr3.length-1]);

        // int[] arr4= new int[]{10,2,3,4,5,6,7,8,6};
        // for(int element : arr4){
            
        //     System.out.print(element+" ");
        // }

        // int[] arr5= arrayFunction(10);
        // System.out.println(Arrays.toString(arr5));
        // Arrays.sort(arr5);
        // System.out.println(Arrays.toString(arr5));

        // Arrays.sort(arr5);
        // // Sorting an array
        // System.out.print(Arrays.toString(arr5));


        // String [] arr6= {"adam","akshya","arjyan","ava","amit"};
        // Arrays.sort(arr6);
        // System.out.println("Sorted array "+Arrays.toString(arr6));

        // if (Arrays.binarySearch(arr6, "amit")>0) {
        //     System.out.println("Value is present in the array");
        // } else{
        //     System.out.println("Value is not available");
        // }

        printNumber("Arjyan bibhushan mohanty");
        
        }


        //variable argument in java
        public static void printNumber(String name){
            String[] separatedNumber=name.split(" ");            
            System.out.println(Arrays.toString(separatedNumber));
        }
        
    public static int[] arrayFunction(int length){
        Random randomNumber= new Random();
        int[] arr= new int[length];

        for(int i=0;i<arr.length;i++){
            arr[i]=randomNumber.nextInt(10,20);
        }
        return arr;
    }

}
