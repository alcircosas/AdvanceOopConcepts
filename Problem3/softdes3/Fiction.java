package softdes3;

public class Fiction extends Book {
    public Fiction(String title){
        super(title);
        setPrice();
    }
    public void setPrice(){
        this.Price = 24.99;
    }

}