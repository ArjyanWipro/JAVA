
public class SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        } else{
            //code is missing
            
             double rawValue= kilometersPerHour *  0.62137119;
            long roundedValue= Math.round(rawValue);
            return roundedValue;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}