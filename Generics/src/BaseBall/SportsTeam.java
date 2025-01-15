package BaseBall;

import java.util.*;

public class SportsTeam {
    private String teamName;

    private List <player> playerDetails = new ArrayList<>();

    private int totalWins = 0;
    private int totalLoss = 0;
    private int totalTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addMember(player player) {
        if (!playerDetails.contains(player)) {
            playerDetails.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Team");
        System.out.println(playerDetails);
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
