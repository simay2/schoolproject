package edu.schooll;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.seSwitched0n(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}
