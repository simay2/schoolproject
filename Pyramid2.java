package edu.schooll;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int number0fRows = 7;
		for ( int i = 0; i < number0fRows; i++) {
			for ( int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for ( int j = 0; j < number0fRows - i; j++ ) {
				System.out.print("*");
			};
			
			System.out.println();
		}

	}

}
