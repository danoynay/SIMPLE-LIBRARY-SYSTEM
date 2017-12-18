import java.util.Collection;
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Book> booksWritten;

    public Author(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<Book>(); 
    }
    
    public String getName(){ return name; }
    public ArrayList<Book> getBooksWritten(){return booksWritten;}

    public void addBook(Book b) {
        booksWritten.add(b);
    }
}
