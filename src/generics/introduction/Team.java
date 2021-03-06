package generics.introduction;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
        members.add(player);
        System.out.println(player.getName() + " picked for team " + this.name);
        return true;
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int thereScore){
        if(ourScore > thereScore){
            won++;
        } else if(ourScore < thereScore){
            lost++;
        } else {
            tied++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null, thereScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
