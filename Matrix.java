package com.code.java.basics;

import java.util.*;

/**
 * 
 * @author jag mohan
 * addition
 * subtraction
 * multiplication
 */
public class Matrix {
	private int row;
	private int col; 
	private int data[][];
	/**
	 * 
	 * @param row
	 * @param col
	 */
	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		data = new int[row][col];
	}
	public void insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in Matrix ");
		
		for(int i = 0; i<this.row; i++){
			for(int j = 0; j<this.col;j++) { 
				data[i][j] = sc.nextInt();
			}
		}
	}
	public Matrix add(Matrix a) {
		
		if(this.row != a.row || this.col != a.col) {
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrix c = new Matrix(row, col);
		for(int i = 0; i<row; i++) {
			for(int j =0; j<col;j++) { 
				c.data[i][j] = this.data[i][j] + a.data[i][j];
			}
		}
		return c;
	}
	public Matrix subtract(Matrix a) {
		
		if(this.row != a.row || this.col != a.col) {
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrix c = new Matrix(row, col);
		for(int i = 0; i<row; i++) {
			for(int j =0; j<col;j++) { 
				c.data[i][j] = this.data[i][j] - a.data[i][j];
			}
		}
		return c;
	}
	public Matrix multi(Matrix a) {
		
		if(this.col != a.row) {
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrix c = new Matrix(this.row, a.col);
		
		for(int i = 0; i<c.row;i++) {
			for(int j = 0; j<c.col;j++) {
				for(int k = 0; k<this.col;k++) { 
					c.data[i][j] += (this.data[i][k] * a.data[k][j]);
				}
			}
		}
		return c;
	}
	public void print() {
		
		for(int i = 0; i<this.row; i++) {
			for(int j = 0; j<this.col; j++) { 
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int[][] getData() {
		return data;
	}
	public void setData(int[][] data) {
		this.data = data;
	}
	
	
	
}
