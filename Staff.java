package twenty;

import java.util.Date;

public class Staff extends Employee {
private String title;

public Staff(String name, 
		String adress, 
		String phoneNumber, 
		String e_mail,
		String office,
		double salary,
		String title) {
	super( name, 
			 adress, 
			 phoneNumber, 
			e_mail,
			office,
			 salary) ;
	this.title = title; 
}

public String getTitle() {
	return title;
}
public void setTitle(String rank) {
	this.title = title;
}

public String toString() {
	return super.toString() +
			"\n" +" Title:" + title;
			
			}
}





