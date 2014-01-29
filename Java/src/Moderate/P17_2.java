package Moderate;

/**
 * Design an algorithm to figure out if someone has won a game of tic-tac-toe
 * @author Andy
 *
 */
public class P17_2 {

	private static boolean main(boolean[][] board) {
		if (board.length != 3 || board[0].length != 3) {
			return false;
		}
		
		int countRow = 0;
		int countCol = 0;
		for (int i=0; i<3; i++) {
			// Reset
			countRow = 0;
			countCol = 0;
			for (int j=0; j<3; j++) {
				// Check the row
				if (board[i][j]) {
					countRow++;
				}
				// Check the column
				if (board[j][i]) {
					countCol++;
				}
			}
			
			// Check if won
			if (countRow == 3 || countCol == 3) {
				return true;
			}
		}
		
		// reuse countRow and countCol
		// for diagonals
		countRow = 0; 
		countCol = 0;
		for (int i=0; i<3; i++) {
			if (board[i][i]) {
				countRow++;
			}
			if (board[2-i][i]) {
				countCol++;
			}
		}
		if (countRow == 3 || countCol == 3) {
			return true;
		}
		return false;
	}
}
