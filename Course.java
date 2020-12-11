package lessons.fifteen.seventeen;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int number0fStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[number0fStudents] = student;
		number0fStudents++;
	}
	
	public void dropStudet(String student) {
		for(int i = 0; i < number0fStudents; i++) {
			if(students[i].equals(student)) {
				for(int j = i; j < number0fStudents - 1; j++ ) {
					students[j] = students[j + 1];
				}
				
				students[number0fStudents - 1] = null;
				number0fStudents--;
				break;
			}
		}
	}

	public String getCourseName() {
		return courseName;
	}

    public String[] getStudents() {
    	return students;
	}
    
    public int getNumber0fStudents() {
    	return number0fStudents;
    }
	

}
