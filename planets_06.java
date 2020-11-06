package edu.schooll;

import java.util.Scanner;

public class planets_06 {

	public planets_06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a weight, please!");
		
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter planet of the Solar System!");
		String planet = sc.nextLine();
		
		double convertigCoeff = 1;
		
		switch(planet) {
		case "Mercury": convertigCoeff = 0.38;break;
		case "Venus": convertigCoeff = 0.91;break;
		case "Mars": convertigCoeff = 0.38;break;
		case "Jupiter": convertigCoeff = 2.36;break;
		case "Saturn": convertigCoeff = 0.92;break;
		case "Uranus": convertigCoeff = 0.89;break;
		case "Neptune": convertigCoeff = 1.13;break;
		}
		
		System.out.print("Your weight on " + planet + " " + convertigCoeff + weight);
		}
}
