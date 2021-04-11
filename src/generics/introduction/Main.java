package generics.introduction;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer messy = new FootballPlayer("Messy");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");

/*
This cause the problem any other player will be add to the same team
 */
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());


        /*
        * here are the generic class
        * */

        TeamGeneric<FootballPlayer> teamGeneric = new TeamGeneric<>("Adelaide Crows");
        teamGeneric.addPlayer(joe);
        teamGeneric.addPlayer(messy);
        // Error
//        teamGeneric.addPlayer(pat);
//        teamGeneric.addPlayer(beckham);
    }
}
