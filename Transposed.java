package edu.schooll;

import java.util.Scanner;

class Transposed {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number on raws");
		int rawSize = sc.nextInt();
		System.out.println("Enter a number on colums");
		int columnSize = sc.nextInt();
		int[][] matrix = new int [rawSize][columnSize];
		int [][] transposed = new int [columnSize][rawSize];
		for(int i = 0; i < rawSize; i++) {
			for(int j = 0; j <columnSize; j++) {
				System.out.println("Enter a number on index" + i + "," + j);
				matrix[i][j] = sc.nextInt();
				}
		}
		for(int i = 0; i < rawSize; i++ ) {
			for(int j = 0; j < columnSize; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
		

	


