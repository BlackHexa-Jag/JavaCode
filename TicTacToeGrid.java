package com.code.java.basics;

/**
 * 
 * @author Jag Mohan
 * Write a code to print the below Grid
 * Hint : first create a comb like structure then print +--+--+--+ in the end
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
 *
 */

public class TicTacToeGrid {
	public static void printGrid() {
		for (int i = 0; i < 3; i++) {
			System.out.print("+--+--+--+\n|  |  |  |\n");
//			System.out.println();
		}
		System.out.print("+--+--+--+\n");
	}
	public static void printGrid(int rows) {
		for (int i = 0; i < rows; i++) {
			System.out.print("+--+--+--+\n|  |  |  |\n");
//			System.out.println();
		}
		System.out.print("+--+--+--+\n");
	}
	public static void printGrid(int rows, int columns) {
		if(rows <= 0 || columns <= 0) {
			throw new RuntimeException("Rows or Columns can't be negative");
//			System.out.println("Rows or Columns can't be negative");
//			return;
		}
		StringBuffer combSubStructure = new StringBuffer();
		
		for (int i = 0; i < columns; i++) {
			combSubStructure.append("+--");
		}
		combSubStructure.append("+");
		
		StringBuffer combStructure = new StringBuffer(combSubStructure);
		combStructure.append("\n|");
		
		for (int i = 0; i < columns; i++) {
			combStructure.append("  |");
		}
		for (int i = 0; i < rows; i++) {
			System.out.println(combStructure);
		}
		System.out.print(combSubStructure);
	}
	
	public static void main(String[] args) {
//		TicTacToeGrid.printGrid();
//		TicTacToeGrid.printGrid(5);
//		System.out.println("\n");
		TicTacToeGrid.printGrid(2,0);
	}

}
