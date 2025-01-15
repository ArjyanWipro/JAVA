public class methodOverloading {
    
    public static void main(String []args){
        System.out.println("Your heigh in cm is "+convertToCentimeters(10));
        System.out.println("Your height in inches is "+convertToCentimeters(6,10));

    }
    //here we are declaring two methods with the same name to demostrate the method overloading

    public static double convertToCentimeters(int heightInInches){
     double outputInCm= heightInInches * 2.54;
     return outputInCm;   
    }

    public static double convertToCentimeters(int heightInFeet,int remainingInches){
    //  double feetToInch= heightInFeet * 12;
    //  double totalInch=((feetToInch + remainingInches)*2.54);
     return convertToCentimeters(heightInFeet);   
    }
}
