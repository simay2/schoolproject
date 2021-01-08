package twenty;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side a of a triangle");
		double a = sc.nextDouble();
		System.out.println("Input side b of a triangle");
		double b = sc.nextDouble();
		System.out.println("Input side c of a triangle");
		double c = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Input side color of a triangle");
		String color = sc.nextLine();
		System.out.println("Input if a triangle is filled (true/false)");
		boolean isFilled = sc.nextBoolean();
		
		Triangle triangle = new Triangle(a,b,c);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		System.out.println(triangle.triangledescription() + "\n" + triangle.toString());
		
	}

}
