public class Game {

    private Player playerOne;
    private Player playerTwo;


    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Choice playerOneChoice = playerOne.getPlayerChoice();
        Choice playerTwoChoice = playerTwo.getPlayerChoice();
        determineWinner(playerOneChoice, playerTwoChoice);
    }

    private void determineWinner(Choice playerOneChoice, Choice playerTwoChoice) {
        if (playerOneChoice == playerTwoChoice) {
            printPlayersChoices(playerOneChoice, playerTwoChoice);
            System.out.println("This game is a tie!");
        } else if (isPlayerOneWinner(playerOneChoice, playerTwoChoice)) {
            printPlayersChoices(playerOneChoice, playerTwoChoice);
            System.out.println(playerOne.getName() + " is a winner!");
        } else {
            printPlayersChoices(playerOneChoice, playerTwoChoice);
            System.out.println(playerTwo.getName() + " is a winner!");
        }
    }

    private void printPlayersChoices(Choice playerOneChoice, Choice playerTwoChoice) {
        System.out.println(playerOne.getName() + " has chosen " + playerOneChoice.getLabel());
        System.out.println(playerTwo.getName() + " has chosen " + playerTwoChoice.getLabel());
    }

    private boolean isPlayerOneWinner(Choice playerOneChoice, Choice playerTwoChoice) {
        return (playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS) ||
                (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.PAPER) ||
                (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.ROCK);
    }
}


