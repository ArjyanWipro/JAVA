package BaseBall;

interface player {
    String name();
}

record BaseBallPlayer(String name, int position) implements player {
}

record CricketPlyer(String name, int position) implements player {
}

public class Main {
    public static void main(String[] args) {
        BaseballTeam rigingCuttack = new BaseballTeam("Riging Cuttack");
        BaseballTeam bbsrDon = new BaseballTeam("Bbsr Don");

        scoreDetails(rigingCuttack, 5, bbsrDon, 3);
        System.out.println("------------------------");
        SportsTeam sportsTeamName = new SportsTeam("test1");
        SportsTeam sportsTeamName2 = new SportsTeam("test2");

        scoreDetails(sportsTeamName, 5, sportsTeamName2, 3);

        System.out.println(bbsrDon.ranking() + "" + bbsrDon.getScore());

        BaseBallPlayer Arjyan = new BaseBallPlayer("Arjyan Bibhushan", 1);
        BaseBallPlayer Aditya = new BaseBallPlayer("Aditya Narayan Lenka", 2);

        BaseBallPlayer Ankur = new BaseBallPlayer("Aditya Mohanty", 3);

        rigingCuttack.addMember(Aditya);
        rigingCuttack.addMember(Arjyan);

        rigingCuttack.listTeamMembers();
        System.out.println("------------------------");
        SportsTeam india = new SportsTeam("INDIA");

        var cricketPlayer1 = new CricketPlyer("Virat kohli", 2);
        var cricketPlayer2 = new CricketPlyer("Rohit Sharma", 1);

        var cricketPlayer3 = new CricketPlyer("Ms dhoni", 3);


        india.addMember(cricketPlayer1);
        india.addMember(cricketPlayer2);

        india.listTeamMembers();

        System.out.println("------------------");

        Team<BaseBallPlayer> baseballTeam= new Team<>("Baseball");
        Team<CricketPlyer> cricketTeam= new Team<>("Cricket");

        baseballTeam.addMember(Ankur);
        cricketTeam.addMember(cricketPlayer3);

        baseballTeam.listTeamMembers();
        cricketTeam.listTeamMembers();

        System.out.println("------------------");
        // Team<String> teamA= new Team<>("A");
        // teamA.addMember("player1");
        // teamA.listTeamMembers();

        // Team<String> teamB= new Team<>("B");
        // teamB.addMember("player2");
        // teamB.listTeamMembers();

        // scoreDetails(teamA, 10, teamB, 0);
    }

    public static void scoreDetails(BaseballTeam team1, int t1Score, BaseballTeam team2, int t2Score) {
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t1Score, t2Score);
        System.out.printf("%s,%s,%s,%n", team1, message, team2);
    }

    public static void scoreDetails(SportsTeam team1, int t1Score, SportsTeam team2, int t2Score) {
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t1Score, t2Score);
        System.out.printf("%s,%s,%s,%n", team1, message, team2);
    }

    public static void scoreDetails(Team team1, int t1Score, Team team2, int t2Score) {
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t1Score, t2Score);
        System.out.printf("%s,%s,%s,%n", team1, message, team2);
    }
}
