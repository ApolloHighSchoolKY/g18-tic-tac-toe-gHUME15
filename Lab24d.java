//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		// Read how many times you should read
		//Make a int varible file.nextint
		// file.nextLine()
		//Make a Tictactoe object for each game in the file
		//Print the game(Tictaktoe object)
		// Print the winer

		 int numGames = file.nextInt();
		 file.nextLine();
 
		 for (int i = 0; i < numGames; i++) {
			 String game = file.nextLine();
 
			 TicTacToe ttt = new TicTacToe(game);
 
			 System.out.println(ttt);
 
			 System.out.println("Winner: " + ttt.getWinner());
		 } file.close();
		}
	}




