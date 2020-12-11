package lessons.fifteen.seventeen;

public class MyPointTester {

	public static void main(String[] args ) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(10, 30.5);
		
		
		System.out.println(a.distance(b));
	}

}
