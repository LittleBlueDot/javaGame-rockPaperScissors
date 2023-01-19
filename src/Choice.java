import java.util.Random;

enum Choice {
    ROCK("Rock"),
    SCISSORS("Scissors"),
    PAPER("Paper");

    private final String label;

    private Choice(String label) {

        this.label = label;
    }
    public String getLabel() {

        return this.label;
    }

    public static Choice random() {
        int length = values().length;
        Random random = new Random();
        int randomNumber = random.nextInt(length);
        return values()[randomNumber];
    }
}
