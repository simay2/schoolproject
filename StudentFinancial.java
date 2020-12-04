package edu.schooll;

import java.util.Scanner;

class StudentFinancial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			sc.nextLine();
			// students[i].name = name;
			// students[i].grade = grade;
			students[i] = new Student(name, grade);
		}

		displayStudentsEligible(students);
	}

	public static void displayStudentsEligible(Student students[]) {
		for (Student s : students) {
			if (isStudentEligible(s)) {
				System.out.println(s.name);

			}
		}
	}

	public static boolean isStudentEligible(Student student) {
		return student.grade > 5.50;
	}
}
