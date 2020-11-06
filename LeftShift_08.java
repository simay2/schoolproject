package edu.schooll;

import java.util.Scanner;

class LeftShift_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		for( int i = 0; i < 10; i++) {
			array[i] =sc.nextInt();
			}
		
		int temp = array[0];
		
		for ( int i = 0; i < array.length -1 ; i++) {
			array[i] = array[ i + 1];
		}
		
		array[ array.length -1 ] = temp;
		
		for( int  i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

}
