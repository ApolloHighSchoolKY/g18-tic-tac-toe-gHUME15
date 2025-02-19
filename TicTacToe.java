//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = ' ';  
		}
		}


	}

	public TicTacToe(String game)
	{
		// Row major order will happed here
		mat = new char[5][5];

		for(int i = 0; i<5;i++){
			for(int j=0; j<5;j++) {
				mat[i][j] = game.charAt(i);
	//mising inside the ()		
			}
		}


	}

	public String getWinner()
	{
		for (int i = 0; i < 5; i++) {
			if (mat[i][0] != ' ' && mat[i][0] == mat[i][1] &&mat[i][1] ==mat[i][2] && mat[i][2] == mat[i][3] && mat[i][3]== mat[i][4]) {
				return mat[i][0] + " Win";}
		}
		for (int j = 0; j < 5; j++) {
			if (mat[0][j] != ' ' && mat[0][j] == mat[1][j] &&mat[1][j] ==mat[2][j] && mat[2][j] == mat[3][j] && mat[3][j] == mat[4][j]) {
				return mat[0][j] + " Win";
			}
		}
		if (mat[0][0] != ' ' && mat[0][0] == mat[1][1] &&mat[1][1] ==mat[2][2] && mat[2][2] == mat[3][3] && mat[3][3] == mat[4][4]) {
			return mat[0][0] + " Win";
		}
	
		
		if (mat[0][4] != ' ' && mat[0][4] == mat[1][3] &&mat[1][3] ==mat[2][2] && mat[2][2] == mat[3][1] && mat[3][1] == mat[4][0]) {
			return mat[0][4] + " Win"; 
		}
	
		
		return "No One Won";
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				output += mat[i][j];
				if (j < 4) {
					output += " | ";
				}
			}
			output += "\n";
	
			if (i < 4) {
				output += "--------------\n";
			}
		}
	
		return output;
	} 
}