/*
*
* Clifford Joseph
* CSC 242 Tic Tac Toe 
* cjose12@u.rochester.edu
*
*/
import java.util.Scanner;

public class Game {

	public void gameDriver() {
		Scanner scan = new Scanner(System.in);
		String cont = null;
		do {
			String choice;
			do {
				System.err.print("Would you like to be player X or O? ");
				choice = scan.next();
			} while (!choice.equals("x") && !choice.equals("o"));
			Board_1 g1 = new Board_1(choice);
			g1.test1Board(g1.initialState);
			if (g1.result != -10) {
				do {
					System.err.print("Would you like to play again? y/n? ");
					cont = scan.next();
				} while (!cont.equals("y") && !cont.equals("n"));
			}
		} while (cont.equals("y"));
	}
	
	public static void main(String[] args) {
		Game game1 = new Game();
		game1.gameDriver();

	}

}
