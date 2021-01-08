package twenty;

public class Person {
	
	private String name;
	private String adress;
	private String phoneNumber;
	private String e_mail;
	
	public Person(String name, String adress, String phoneNumber, String e_mail){
		this.name = name;
		this.adress = adress;
		this.e_mail = e_mail;
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "Name:" + name + "\n" +
			"Adress:" + adress + "\n" +
			"Phone number:" + phoneNumber + "\n" +
			"Email:" + e_mail;
	}

}
