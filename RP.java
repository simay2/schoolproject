package edu.schooll;

public class RP {
	private int n = 3;
	private double sideLenght = 1;
	private double x = 0;
	private double y = 0;

	public RP() {
		// TODO Auto-generated constructor stub
	}

	public RP(int aN, double aSideLenght) {
		setN(aN);
		setSideLenght(aSideLenght);
	}

	public RP(int aN, double aSideLenght, double x, double y) {
		setN(aN);
		setSideLenght(aSideLenght);
		setX(x);
		setY(y);
	}
	
	public double getSideLenght() {
		return sideLenght;
	}
	
	public void setSideLenght(double sideLenght) {
		this.sideLenght = sideLenght;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public double getArea() {
		return( n * sideLenght * sideLenght)/(4 * Math.tan(Math.PI/n));
	}
	
	public double getPerimeter() {
		return n * sideLenght;
	}
}
