import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Booklist {
    private ArrayList<Book> list;
    
    // creates an array list
    public Booklist() {
        list = new ArrayList<Book>();
    }

    //add book to list
    public void addBook(Book book) {
        list.add(book);
    }

    public void sortByTitle() {
        Collections.sort(list, Book.titleComparator);
    }

    public void sortByAuthor() {
        Collections.sort(list, Book.authorComparator);
    }

    public Booklist filter(String author) {
        Booklist result = new Booklist();

        for(Book book : list) {
            if(book.getAuthor().equals(author)) {
                result.addBook(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(Book book : list) {
            result += String.format("%s, %s, %s\n", book.getTitle(), book.getAuthor(), book.getDatePublished());
        }
        return result;
    }
}
