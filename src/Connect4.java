import java.util.*;

public class Connect4 {

	public static final char NONE = ' ';
	public static final char RED = 'O';
	public static final char YELLOW = 'X';

	char[][] board;

	/**
	 * Initializes the instance variables.
	 */
	public Connect4() {
		board = new char[6][7];
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				board[i][j] = ' ';
	}

	/**
	 * Returns a copy of the current board
	 *
	 * @return a char matrix
	 */
	public char[][] getBoard() {
		return board;
	}

	/**
	 * Put a piece of the given color in the given column
	 * The function returns the row where the piece have been
	 * put. If the column is full it return -1.
	 *
	 * @param column a column of the board
	 * @param color  RED or YELLOW
	 */
	public int putPiece(int column, char color) {
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][column] == NONE) {
				board[i][column] = color;
				return i;
			}
		}
		return -1;
	}

	/**
	 * Print the screen in the standard output
	 */
	public void printScreen() {
		// Make the header of the board
		System.out.printf("\n ");
		for (int i = 0; i < board[0].length; ++i)
			System.out.printf("   %d", i);
		System.out.println();

		System.out.printf("  ");
		for (int i = 0; i < board[0].length; ++i)
			System.out.printf("----");
		System.out.println("-");

		// Print the board contents
		for (int i = 0; i < board.length; ++i) {
			System.out.printf("%c ", 'A' + i);
			for (int k = 0; k < board[0].length; ++k)
				System.out.printf("| %c ", board[i][k]);
			System.out.println("|");

			// print the line between each row
			System.out.printf("  ");
			for (int k = 0; k < board[0].length; ++k)
				System.out.printf("----");
			System.out.println("-");
		}
	}

	/**
	 * Check if an alignment has been made using the given tile
	 *
	 * @param row
	 * @param column
	 * @return the color if there is an alignment, NONE otherwise.
	 */
	public char checkAlignment(int row, int column) {
		/*if ((board[row+1][column] == board[row][column] && board[row+2][column] == board[row][column] && board[row+3][column] == board[row][column])
                || ())*/
		char color = board[row][column];
		int inARow = 0;
		int inACol = 0;
		int diagR = 0;
		int diagL = 0;
		for (int i = column + 1; i < board.length; i++) {
			if (board[row][i] == color)
				inARow++;
			else {
				break;
			}
		}
		while (inARow < 4) {
			for (int i = column - 1; i >= 0; i--) {
				if (board[row][i] == color)
					inARow++;
				else {
					break;
				}
			}
			break;
		}
		for (int i = row + 1; i < board[row].length - 1; i++) {
			if (board[i][column] == color)
				inACol++;
			else {
				break;
			}
		}
		while (inACol < 4) {
			for (int i = row - 1; i >= 0; i--) {
				if (board[i][column] == color)
					inACol++;
				else {
					break;
				}
			}
			break;
		}
		for (int i = row + 1; i < board[row].length - 1; i++) {
			if (column + (i - row) < board.length) {
				if (board[i][column + (i - row)] == color)
					diagR++;
				else {
					break;
				}
			}
		}
		while (diagR < 4) {
			for (int i = row - 1; i >= 0; i--) {
				if (column + (i - row) < board.length) {
					if (board[i][column - (i - row)] == color)
						diagR++;

				} else {
					break;
				}

				break;
			}
			}
			for (int i = row + 1; i < board[row].length - 1; i++) {
				if (board[i][column - (i - row)] == color)
					diagR++;
				else {
					break;
				}
			}
			while (diagL < 4) {
				for (int i = row - 1; i >= 0; i--) {
					if (board[i][column - (row - i)] == color)
						diagR++;
					else {
						break;
					}
				}
				break;
			}
			return NONE;

	}

		/**
		 * Launch the game for one game.
		 */

	public void play() {
		char currentPlayer = RED;

		// Begin playing the game
		Scanner in = new Scanner(System.in);
		int col = -1;
		int row = -1;

		do {
			currentPlayer = currentPlayer == RED ? YELLOW : RED;
			this.printScreen();
			System.out.printf("Current player: '%c'\n", currentPlayer);

			// read and validate the input
			col = -1;
			row = -1;

			do {
				System.out.printf("Choose a column: ");
				String line = in.nextLine();


				if (line == null || line.length() != 1) {
					// Invalid input, reask for one.
					continue;
				}

				col = line.charAt(0) - '0';
				row = this.putPiece(col, currentPlayer);

			} while (row < 0);

		} while (this.checkAlignment(row, col) == NONE);

		this.printScreen();
		System.out.printf("\n!!! Winner is Player '%c' !!!\n", currentPlayer);
		in.close();

	}
}
