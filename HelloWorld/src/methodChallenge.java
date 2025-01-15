public class methodChallenge {

    public static void displayHighScorePosition(String name , int position){
        System.out.println("Hi "+name+", You managed to get into position "+position+" on score list");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
            // System.out.println("You are on first position");
            return 1;
        }
        if (score >=500 && score <1000) {
            // System.out.println("You are on second position");
            return 2;
        }
        if (score >=100 && score <500) {
            // System.out.println("you are on third position");
            return 3;
        }
        else{
            return 4;
        }
    }
    public static void main(String[] args) {
       
       displayHighScorePosition("Arjyan", calculateHighScorePosition(80));
     

        }
    }
    
