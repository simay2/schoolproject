package twenty;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(
				"Alex", 
				"zhk.Lagera",
				"00083899090",
				"alex@alex.com");
		Student student = new Student(
				"Radi",
				"zhk.Hipodurma",
				"998898989",
				"blabla@bla.com",
				Student.FRESHMAN);
		Employee employee = new Employee(
				"Gosho",
				"zhk.Mladost",
				"09999988888",
				"gogobest@gogo.bg",
				"smg",
				1000);
		Staff staff = new Staff(
				"Pesho"
				"zhk.Mladost4",
				"099999855",
				"pesho123@gogo.bg",
				"BAN",
				1700.0,
			    "director");
		
		
	    Faculty faculty = new Faculty(
				"Mitko"
				"zhk.Vrazdebna",
				"0996677788",
				"mitaka@gogo.bg",
				"NPMG",
				25000.0,
				"11:00 - 18:00",
				"teacher");

	}

}
