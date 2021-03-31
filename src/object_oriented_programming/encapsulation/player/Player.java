package object_oriented_programming.encapsulation.player;

public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <= 100){
            this.health = health;
        }
    }

    public void loseHealth (int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
