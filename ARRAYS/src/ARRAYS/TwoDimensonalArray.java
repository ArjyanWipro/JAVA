import java.util.Arrays;

public class TwoDimensonalArray {
    public static void main(String [] args){
        int[][] d2Array= new int[4][4];

    //    for(int[] element:d2Array){
    //     var innerArray=element;
    //     System.out.println("\t");
    //     for(int innerElement:innerArray){
    //         System.out.print(Arrays.toString(d2Array[innerElement])+" ");
    //     }
    //    }

    for(int i=0;i<d2Array.length;i++){
        int[] innerArray=d2Array[i];

        for(int j=0;j<innerArray.length;j++){
            d2Array[i][j]=(i*10)+(j+1);
        }
    }
    System.out.println(Arrays.deepToString(d2Array));
    }
}
