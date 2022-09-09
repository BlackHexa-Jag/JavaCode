package com.code.java.basics;

import java.util.Scanner;

public class TestMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix 1 : Enter number of rows and column");
		int row = sc.nextInt();
		int col = sc.nextInt();
		Matrix A = new Matrix(row, col);
		A.insert();
		System.out.println("Matrix 2 : Enter number of rows and column");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		Matrix B = new Matrix(row1, col1);
		B.insert();
		A.print();
		B.print();
		System.out.println("ADDITION");
		Matrix C = A.add(B);
		C.print();
		System.out.println();
		System.out.println("SUBTRACTION");
		C= A.subtract(B);
		C.print();
		System.out.println();
		System.out.println("MULTIPLICATION");
		C= A.multi(B);
		C.print();
		System.out.println();
		System.out.println("TRANSPOSE");
		C.transpose().print();
		
	}
}