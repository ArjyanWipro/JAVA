public class dayOfWeek {

    public static void main(String[] args) {
        printDayOfWeek(20);
    }

    public static void  printDayOfWeek(int day){
        
       String dayOfWeek=  switch (day) {
            case 0 -> {yield "sunday";}
            case 1 ->  "monday";
            case 2 ->  "tuesday";
            case 3 ->  "wednesday";
            case 4 ->  "thursday";
            case 5 ->  "friday";
            case 6 ->  "saturday";

            default-> "invalid input";
        };

        System.out.println(day+" is "+dayOfWeek);
}
}
