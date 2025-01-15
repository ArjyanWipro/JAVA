public class intrestRate {
    public static void main(String args[]) {
        for (double increase = 7.5; increase < 10; increase += 0.25) {

            System.out.println("For amount 100 compunt intrest is (" + intrest(100, increase)+")");
        }

    }

    public static double intrest(double amount, double per) {

        return (amount * (per / 100));

    }

}
