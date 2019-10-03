package edu.wofford;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;
//import org.junit.*;
//import static org.junit.Assert.*;


public class ConsoleMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TicTacToeModel game = new TicTacToeModel();
		while(game.getResult() == TicTacToeModel.Result.NONE){
			System.out.println(game.toString());
			System.out.println("Enter a Row: ");
			int row = keyboard.nextInt();
			System.out.println("Enter a Column: ");
			int col = keyboard.nextInt();
			if (game.getMarkAt(row, col) == TicTacToeModel.Mark.EMPTY) {
				game.setMarkAt(row,col);
			}
		}
		System.out.println(game.toString());
		if (game.getResult() == TicTacToeModel.Result.XWIN) {
			System.out.println("X wins");
		}
		if (game.getResult() == TicTacToeModel.Result.OWIN) {
			System.out.println("O wins");
		}
		if (game.getResult() == TicTacToeModel.Result.TIE) {
			System.out.println("Tie");
		}



	}
}