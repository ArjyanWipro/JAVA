package BaseBall;


import java.util.*;

public class Team <T extends player>{
    private String teamName;

    private List <T> playerDetails = new ArrayList<>();

    private int totalWins = 0;
    private int totalLoss = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addMember(T t) {
        if (!playerDetails.contains(t)) {
            playerDetails.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Team");
        for(T t:playerDetails){
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return (totalLoss * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int thereScore) {

        String message = " Lost to ";
        if (ourScore > thereScore) {
            totalWins++;
            message = " Beat to ";
        } else if (ourScore == thereScore) {
            totalTies++;
            message = " Tied ";
        } else {
            totalLoss--;
            message = " Loss to ";
        }

        return message;
    }

    public int getScore() {
        return (totalWins + totalTies) - totalLoss;
    }

    @Override
    public String toString() {
        return "Team name= " + teamName + " Ranking= " + ranking();

    }
}
