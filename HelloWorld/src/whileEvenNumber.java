public class whileEvenNumber {
    public static void main(String args[]){
        int i=4;
        int countEven=0;
        int countOdd=0;
        while (i<=20){
            i++;
            if(isEvenNumber(i)==true){
                System.out.println(i+" ");
                countEven++;
            } if(isEvenNumber(i)==false){
                countOdd++;
            }
            if (countEven ==5){
                System.out.println("Count has exceeded 5");
                System.out.println("Total count of even numbers = "+countEven);
                System.out.println("Total count of odd numbers = "+countOdd);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int input){
        if(input %2==0){
            return true;
        
        } else{
            return false;
        }
    }
}
