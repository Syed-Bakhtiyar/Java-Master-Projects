package generics.introduction;

import java.util.ArrayList;

/*
* Those who extends Player class can be part of generic otherwise not
*
* Player is set to be the upper bound of the of T
*
* class first in uppuer bound lists
*
* implements Comparable because we also want to compare with specific object not of all type which is belong to Player
* */
public class TeamGeneric<T extends Player /*<Interface_1> & <Interface_2>*/> implements Comparable<TeamGeneric<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public TeamGeneric(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( player.getName() + " is already on this team");
            return false;
        }
        members.add(player);
        System.out.println( player.getName() + " picked for team " + this.name);
        return true;
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(TeamGeneric<T> opponent, int ourScore, int thereScore){
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

    @Override
    public int compareTo(TeamGeneric<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        }
        return 0;
    }
}
