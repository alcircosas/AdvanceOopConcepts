package softdes3;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Fiction("Hunger Games");
        books[1] = new NonFiction("Dispatches");
        books[2] = new Fiction("Mortal Instruments");
        books[3] = new NonFiction("Pride and Prejudice");
        books[4] = new Fiction("Beloved");
        books[5] = new NonFiction("Into the wild");
        books[6] = new Fiction("Stardust");
        books[7] = new NonFiction("Say Nothing");
        books[8] = new Fiction("Once upon a time");
        books[9] = new NonFiction("The Right Stuff");

        for (Book book : books) {
        	System.out.println ("BOOK DETAILS");
            System.out.println("Book Title: " + book.getName() + "\nBook Price: $" + book.getPrice());
        }
    }
}