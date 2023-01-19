import java.util.Random;

public class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Choice getPlayerChoice() {
        return Choice.random();
    }
}


