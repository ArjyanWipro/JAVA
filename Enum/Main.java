package Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            enumClass randomWeek = randomEnumName();

           switchDayOfWeek(randomWeek);

        }

    }

    public static void switchDayOfWeek(enumClass weekDays){
        int dayNumber= weekDays.ordinal()+1;

        switch (weekDays) {
            case SATURDAY-> System.out.println("It is a weekend "+weekDays+" day number "+dayNumber);
            case SUNDAY-> System.out.println("It is a weekend "+weekDays+" day number "+dayNumber);
            default->System.out.println("Today is "+weekDays.name().charAt(0)+
            weekDays.name().substring(1).toLowerCase()+" day number "+dayNumber);
        }
    }

    public static enumClass randomEnumName() {
        int randomNumber = new Random().nextInt(7);
        var days = enumClass.values();
        
        return days[randomNumber];

    }
}
