package softdes3;


	public abstract class Book {
	    String Title;
	    double Price;

	    public Book(String name){
	        this.Title = name;
	    }

	    public String getName() {
	        return Title;
	    }

	    public double getPrice() {
	        return Price;
	    }

	    public void setPrice(double price) {
	        this.Price = price;
	    }
	}