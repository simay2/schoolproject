package lessons.fifteen.seventeen;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: " + course1.getNumber0fStudents());
		String[] students = course1.getStudents();
		for( int i = 0; i < course1.getNumber0fStudents(); i++) {
			System.out.print(students[i] + " , ");
		}
		
		course1.dropStudet("Kim Smith");
		System.out.println("\nNumber of students in course1: " + course1.getNumber0fStudents());
		for( int i = 0; i < course1.getNumber0fStudents(); i++) {
			System.out.print(students[i] + " , ");
		}
		
		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumber0fStudents());
	}

}
