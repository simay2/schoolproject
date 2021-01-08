package twenty;

import java.util.Date;

public class Faculty extends Employee {
private String officeHours;
private String rank;

public Faculty(String name, 
		String adress, 
		String phoneNumber, 
		String e_mail,
		String office,
		double salary, 
		String officeHours,
		String rank) {
	super( name, 
			 adress, 
			 phoneNumber, 
			e_mail,
			office,
			 salary) ;
}


public String getOfficeHours() {
	return officeHours;
}
public void setOfficeHours(String officeHours) {
	this.officeHours = officeHours;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}

public String toString() {
	return super.toString() +
			"\n" +" Office Hours:" + officeHours +
			"\n" +" Rank:" + rank ;
			}

}