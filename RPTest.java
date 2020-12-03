package edu.schooll;

public class RPTest {

	public RPTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP p1 = new RP(6, 4);
		RP p2 = new RP(10, 4, 5.6, 7.8);
		RP p3 = new RP();
		System.out.println(p1.getPerimeter());
		System.out.println(p1.getArea());
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());
		System.out.println(p3.getPerimeter());
		System.out.println(p3.getArea());

	}

}
