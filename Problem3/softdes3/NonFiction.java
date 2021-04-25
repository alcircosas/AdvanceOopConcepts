package softdes3;

public class NonFiction extends Book{
    public NonFiction(String title){
        super(title);
        setPrice();
    }
    public void setPrice(){
        this.Price = 37.99;
    }
}