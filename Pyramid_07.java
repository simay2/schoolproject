package edu.schooll;

import java.util.Scanner;

public class Pyramid_07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number0fRows = 7;
		for (int i = 0; i < number0fRows; i++) {
			for (int j = number0fRows; j > 0; j-- ) {
				System.out.print(j + " ");
			}
			for ( int j = 2; j<= number0fRows - 1; j++ ) {
				System.out.print(j + " ");
			};
			
			System.out.println();
			}
	}
}
