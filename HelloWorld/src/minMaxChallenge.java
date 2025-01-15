import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String args[]) {
        // This try method is recomended by vs code
        try (Scanner sc = new Scanner(System.in)) {
            boolean check = true;

            int maxNumber = 0;
            int minNumber = 0;
            // System.out.println(input);
            try {
                System.out.println("Enter a number to start");
                int previousInput = Integer.parseInt(sc.nextLine());
                maxNumber = previousInput;
                minNumber = previousInput;
                while (check) {

                    System.out.println("Input a number");
                    int input = Integer.parseInt(sc.nextLine());
                    if (input < previousInput && input < minNumber) {
                        minNumber = input;
                        previousInput = input;
                    }
                    
                    if (input > previousInput && input > maxNumber) {
                        maxNumber = input;
                        previousInput = input;
                    }
                }

            } catch (java.lang.NumberFormatException charecterError) {
                System.out.println("You have terminated the programe");
                System.out.println("Maximum Number is " + maxNumber + " Minimum number is " + minNumber);
                check = false;
            }
        }
    }
}
