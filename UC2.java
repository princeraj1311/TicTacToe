import java.util.Random;
public class UC2 {

    static boolean isHumanTurn;
    static char    humanSymbol;
    static char    computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initialises the game state.
     *
     * Toss result 0 → Human goes first and gets 'X'
     * Toss result 1 → Computer goes first and gets 'X'
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);   // generates 0 or 1

        if (toss == 0) {
            isHumanTurn    = true;
            humanSymbol    = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn    = false;
            humanSymbol    = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("===== TOSS RESULT =====");
        System.out.println("Human    plays : " + humanSymbol);
        System.out.println("Computer plays : " + computerSymbol);
        if (isHumanTurn) {
            System.out.println("Result : Human goes FIRST!");
        } else {
            System.out.println("Result : Computer goes FIRST!");
        }
        System.out.println("=======================");
    }
}