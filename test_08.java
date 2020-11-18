package edu.schooll;

import java.util.Scanner;

class test_08 {

	public test_08() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_STUDENTS = 3;
		final int NUMBER_QUESTIONS = 3;
		char [][] answers = new char[NUMBER_STUDENTS][NUMBER_QUESTIONS];
		char[] keys = new char [NUMBER_QUESTIONS];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < NUMBER_STUDENTS ;i++) {
			for(int j = 0; j < NUMBER_QUESTIONS; j++) {
				System.out.println("Enter answer for question" + ( j + 1 ) + "for student" + ( i + 1));
				answers[i][j] = sc.nextLine().charAt(0);
			}
		}

		for(int i = 0; i < NUMBER_STUDENTS; i++) {
			int correctCount = 0;
			for(int j = 0; j < NUMBER_QUESTIONS; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			System.out.println("Student" + i + "'s correct count is" + correctCount);
		}
	}

}
