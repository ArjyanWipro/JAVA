public class sumOfIndividualDigits {
    public static void main(String args[]) {
            System.out.println(sumDigits(2));
    }

    public static int sumDigits(int number) {
        int lastDigit = 0;
        int sum = 0;
        if (number <= 0) {
            return -1;
        } else {
            while (number != 0) {
                lastDigit = number % 10;
                number = number / 10;
                sum += lastDigit;
            }
            return sum;

        }
    }
}
