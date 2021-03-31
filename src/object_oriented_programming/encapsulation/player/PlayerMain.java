package object_oriented_programming.encapsulation.player;

public class PlayerMain {
    public static void main(String[] args) {
        Player player = new Player("Bakhtiyar", 200, "Sword");
        System.out.println("Initial health is: " + player.getHealth());
    }
}
