public class secondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(22344));
        // System.out.println(getDurationString(65,59));
    }

    public static String getDurationString(int second) {
        if (second > 0) {
            int min = second / 60;

            return getDurationString(min, second);
        } else {

            return "Invalid Number";
        }

    }

    public static String getDurationString(int minute, int second) {
        if (minute > 0) {
            int hour = minute / 60;
            int remainingMinutes = minute % 60;
            int remainingSeconds = second % 60;

            return hour + "H " + remainingMinutes + "MM " + remainingSeconds + "SS ";
        } else {
            return "invalid input";
        }

    }
}
