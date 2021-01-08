package twenty;

public class ChildrenBook extends Book {
	private int age;
	
	public ChildrenBook(double regularPrice,
            String publisher,
            int yearPublished,
		    int age){
        super(regularPrice, publisher, yearPublished);
        setAge(age);
    }
	
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
