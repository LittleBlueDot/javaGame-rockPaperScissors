import java.util.Random;

public class Player {

    // test comment
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


