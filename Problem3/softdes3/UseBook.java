package softdes3;

public class UseBook {
    public static void main(String[] args) {
        Fiction Fiction_Book = new Fiction("Hunger Games");
        NonFiction NFiction_Book = new NonFiction("Into the wild");
        System.out.println("Fiction: "+Fiction_Book.getName()+ "\nCosts: $"+Fiction_Book.getPrice());
        System.out.println("NonFiction: "+NFiction_Book.getName()+"\nCosts: $"+NFiction_Book.getPrice());
    }
}