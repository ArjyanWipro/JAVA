public class primeNumber {
    public static void main(String args[]) {
        int count = 0;
        for (int j = 0; j <= 100; j++) {
            if (isPrime(j)==true) {
                System.out.println(j+" Is prime number");
            count++;
            }
            
          
        }
        System.out.println("Total number of prime number present is"+ count);

    }

    public static boolean isPrime(int number) {
        if (number >= 1000) {
            System.out.println("Enter number below than 1000");
        }
        if (number <= 2) {
            return (number == 2);
        }
        for (int i = 2; i < number; i++) {
            if (i % number == 0) {
                return false;
            }
        }
       
        return true;
    }
}
