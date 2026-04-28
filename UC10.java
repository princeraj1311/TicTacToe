public class UC10 {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests draw detection logic
     * with a fully filled board (draw) and a partially filled board.
     */
    public static void main(String[] args) {

        // Test 1: Full board with no winner → Draw
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'X'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'O';

        System.out.println("Test 1 – Full board (no winner):");
        printBoard();
        System.out.println("Is it a draw? → " + isDraw());   // true
        System.out.println();

        // Test 2: Board with empty cells → Not a draw
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = '-';
        board[1][0] = '-'; board[1][1] = 'X'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = '-'; board[2][2] = 'X';

        System.out.println("Test 2 – Partial board (cells remaining):");
        printBoard();
        System.out.println("Is it a draw? → " + isDraw());   // false
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output : true if draw (no '-' cells remain), false otherwise
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;   // found an empty cell → game still going
                }
            }
        }
        return true;   // no empty cell found → draw
    }

    // -------------------------------------------------------
    // Helper: print board
    // -------------------------------------------------------
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++)
                System.out.print(board[row][col] + " | ");
            System.out.println();
            System.out.println("-------------");
        }
    }
}