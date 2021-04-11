package generics.league;


public class Main {
    public static void main(String[] args) {
        League<TeamGeneric<FootballPlayer>> league = new League<TeamGeneric<FootballPlayer>>("AFL");

        TeamGeneric<FootballPlayer> footballPlayer_1 = new TeamGeneric<>("messy_1");
        TeamGeneric<FootballPlayer> footballPlayer_2 = new TeamGeneric<>("messy_2");

        TeamGeneric<BaseballPlayer> baseballPlayerTeamGeneric = new TeamGeneric<>("messy_2");

        league.add(footballPlayer_1);
        league.add(footballPlayer_2);

        /*
        * not allow to add
        * */
//        league.add(baseballPlayerTeamGeneric);

    }
}
