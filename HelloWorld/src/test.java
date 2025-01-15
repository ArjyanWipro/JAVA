// import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // call method here

        // numberToWords(6);
        // printSquareStar(6);
        // printSquareStar(28);
        // printSquareStar(22);
        // inputThenPrintSumAndAverage();

        System.out.println(getBucketCount(10.80, 20.60, 8.6, 6));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
        // dont remove below curly brace
    }
    // write code below

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double totalArea = height * width;
            // useing Math.ceil function so that the number will be a round value
            double totalBucket = Math.ceil(totalArea / areaPerBucket);

            double requiredBuckets = totalBucket - extraBuckets;
            // converting double to integer for method return type
            int intRequiredBuckets = (int) requiredBuckets;
            return intRequiredBuckets;

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double totalArea = width * height;
            double totalBucket = totalArea / areaPerBucket;
            // rounding the total bucket and doing implicit type casting
            int roundOfTotalBucket = (int) Math.ceil(totalBucket);
            return roundOfTotalBucket;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double totalBucket = area / areaPerBucket;
            // converting double to integer for return type
            int intTotalbucket = (int) Math.ceil(totalBucket);
            return intTotalbucket;
        }
    }
    // dont change code below
}
