import java.lang.Comparable;
import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String datePublished;

    public String getTitle(){ return this.title; }
    public String getAuthor(){ return author; }
    public String getDatePublished(){ return datePublished; }

    public void setTitle(String title){ this.title = title; }
    public void setAuthor(String author){ this.author = author; }
    public void setDatePublished(String datePublished){ this.datePublished = datePublished; }

    //constructor
    public Book(String title, String author, String datePublished) {
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
    }

    @Override
    public int compareTo(Book other) {
        int comparison = this.title.compareTo(other.title);
        if(comparison != 0) {
            return comparison;
        } else {
            this.author.compareTo(other.author);
        }
        return 0;
    }

    public static final Comparator<Book> titleComparator = new Comparator<Book>() {
        public int compare(Book a, Book b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    };

    public static final Comparator<Book> authorComparator = new Comparator<Book>() {
        public int compare(Book a, Book b) {
            return a.getAuthor().compareTo(b.getAuthor());
        }
    };

}
