/**
 * The class can play the chess
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */

import java.io.NotActiveException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.lang.model.element.NestingKind;
import java.util.*;

public class Chess {
	
	/**
	 *  @param String[][] chessBoard is the chessBoard.
	 *  @param double maxWeight is the maxWeight
	 *  @param int maxPersons is the maxPersons
	 */
	public String[][] chessBoard = {
			{ " rook  ", "knight ", "bishop ", "queen  ", " king  ", "bishop ", "knight ", " rook  " },
			{ " pawn  ", " pawn  ", " pawn  ", " pawn  ", " pawn  ", " pawn  ", " pawn  ", " pawn  " },
			{ "       ", "       ", "       ", "       ", "       ", "       ", "       ", "       " },
			{ "       ", "       ", "       ", "       ", "       ", "       ", "       ", "       " },
			{ "       ", "       ", "       ", "       ", "       ", "       ", "       ", "       " },
			{ "       ", "       ", "       ", "       ", "       ", "       ", "       ", "       " },
			{ " PAWN  ", " PAWN  ", " PAWN  ", " PAWN  ", " PAWN  ", " PAWN  ", " PAWN  ", " PAWN  " },
			{ " ROOK  ", "KNIGHT ", "BISHOP ", "QUEEN  ", " KING  ", "BISHOP ", "KNIGHT ", " ROOK  " }, };
	/**
	 * draw chessboard
	 * @return printString
	 */
	public String toString() {
		String[][] rowline = new String[9][9];
		String[][] coline = new String[9][9];
		String a = "       a       b       c       d       e       f       g       h   ";
		String[] n = { " 8 ", " 7 ", " 6 ", " 5 ", " 4 ", " 3 ", " 2 ", " 1 ", "  " };
		String printString = a + "\n";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				rowline[i][j] = "+-------";
			}
		}
		for (int i = 0; i < 9; i++) {
			rowline[i][8] = "+";
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				coline[i][j] = "|";
			}
		}
		for (int i = 0; i < 8; i++) {
			printString = printString + "   ";
			for (int j = 0; j < 9; j++) {
				printString = printString + rowline[i][j];

			}
			printString = printString + "\n";
			printString = printString + n[i];
			for (int j = 0; j < 8; j++) {
				printString = printString + coline[i][j] + chessBoard[i][j];
			}
			printString = printString + coline[1][8];
			printString = printString + n[i] + "\n";
		}
		printString = printString + "   ";
		for (int j = 0; j < 9; j++) {
			printString = printString + rowline[0][j];
		}
		printString = printString + "\n" + a;
		System.out.print(printString);
		return printString;
	}

	public static void main(String[] args) {
		Chess a = new Chess();
		a.toString();
		Pattern p123 = Pattern.compile("[a-h][1-8][a-h][1-8]|q");
		Pattern p1 = Pattern.compile("[a-h][1-8][a-h][1-8]");
		System.out.println("Please enter:\n"
				+ "moves of the type a2a4 from the command line in order to move the gure from a2 to a4  on the chessboard. ");
		Scanner s = new Scanner(System.in);
		String move = s.next();
		while(!move.equalsIgnoreCase("q")) {
			String before = move.substring(0,1);
			String after = move.substring(2,3);
			int mbefore = 0;
			int mafter = 0;
			String temp;
			try {
				switch(before) {
	            case "a":  mbefore=0;         break;
	            case "b":  mbefore=1;         break;
	            case "c":  mbefore=2;         break;
	            case "d":  mbefore=3;         break;
	            case "e":  mbefore=4;         break;
	            case "f":  mbefore=5;         break;
	            case "g":  mbefore=6;         break;
	            case "h":  mbefore=7;         break;
	            default: System.out.println("no such choice1"); /*move=s.next("q");*/ break;
	            }
				switch(after) {
                case "a":  mafter=0;         break;
                case "b":  mafter=1;         break;
                case "c":  mafter=2;         break;
                case "d":  mafter=3;         break;
                case "e":  mafter=4;         break;
                case "f":  mafter=5;         break;
                case "g":  mafter=6;         break;
                case "h":  mafter=7;         break;
                default: System.out.println("no such choice2");/*move=s.next("q");*/  break;
                }
				temp = a.chessBoard[8-(Integer.parseInt(move.substring(1,2)))][mbefore];
                a.chessBoard[8-(Integer.parseInt(move.substring(1,2)))][mbefore]="       ";
                a.chessBoard[8-(Integer.parseInt(move.substring(3,4)))][mafter]=temp;
                a.toString();
           	 	System.out.println();
           	 	System.out.println("Please enter:\n"+
               		 "moves of the type a2a4 from the command line in order to move the gure from a2 to a4  on the chessboard. " );           	 	        		 
           	 	move=s.next();
			}
			catch(IllegalArgumentException e) {
				System.out.println("dd");
			}
		}

	}
}