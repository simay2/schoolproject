package twenty;

public class ComicBook extends Book {
		private String color;
		
		public ComicBook(double regularPrice,
	            String publisher,
	            int yearPublished,
			    String color){
	        super(regularPrice, publisher, yearPublished);
	        setColor(color);
	    }
		
		public double computeSalePrice(){
	        return super.getRegularPrice() * 0.4;
	    }

		public String getColoe() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}


