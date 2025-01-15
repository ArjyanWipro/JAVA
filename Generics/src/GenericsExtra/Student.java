package GenericsExtra;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;
    
    protected static Random randomNumber=new Random();
    private static String[] firstName={"Arjyan","Aditya","Rajesh","Surendra"};
    private static String[] courses={"Java","c++","JavaScript","Jira"};

    public Student(){
        int lastIndex=randomNumber.nextInt(65,91);
        name=firstName[randomNumber.nextInt(4)]+" "+(char) lastIndex;
        course=courses[randomNumber.nextInt(4)];
        yearStarted=randomNumber.nextInt(2018,2024);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course,yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    
}
