package edu.schooll;

public class Tuition_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double initialTuition = 10_000;
		double percentIncrease = 0.06;
		
		double futureTuition = initialTuition;
		for( int i = 0; i < 10; i++ ) {
			futureTuition += percentIncrease + futureTuition;
		}
		
		double entireTuition = 0;
		for( int i = 0; i < 4; i++ ) {
			entireTuition += futureTuition;
			futureTuition += percentIncrease + futureTuition;
		}
		
		System.out.print("A four year study in 10 years cost " + entireTuition);	
	}
	}	


