package edu.schooll;

public class circle {
	public double radius;
	
	public circle() {
		radius = 1;
	}

	public circle( double newRadius ) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getParameter() {
		return Math.PI * radius * 2;
	}
	public void setRadius( double newRadius ) {
	radius = newRadius;
	
	}
		
}
