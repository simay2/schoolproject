package edu.schooll;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cl = new circle();
		System.out.println("Area of cl" + cl.getArea() + "perimeter of cl" + cl.getParameter());

		circle c2 = new circle(5);
		System.out.println("Area of c2" + c2.getArea() + "perimeter of c2" + c2.getParameter());
		
		cl.setRadius(10);
		System.out.println("Area of cl" + cl.getArea() + "perimeter of cl" + cl.getParameter());

	}

}
