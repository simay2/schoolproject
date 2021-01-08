package twenty;

import java.util.Date;

public class GeometricObject {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;

	public GeometricObject() {
		// TODO Auto-generated constructor stub
		setDateCreated(new java.util.Date());
	}
	
	public GeometricObject(String color, boolean filled) {
		setDateCreated(new java.util.Date());
		this.setColor(color);
		this.setFilled(filled);
		
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
