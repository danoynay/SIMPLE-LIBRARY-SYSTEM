public class Engine {
    public static void main(String[] args) {
        Booklist bookList = new Booklist();

        bookList.addBook(new Book("Don Quixote", "Miguel de Cervantes", "December 16, 1987"));
        bookList.addBook(new Book("In Search of Lost Time", "Knor Cubes", "December 16, 1987"));
        bookList.addBook(new Book("Ulysses", "James Joyce", "December 16, 1987"));
        bookList.addBook(new Book("Diary ng Panget", "Nigell Alfeche", "January 17, 1998"));
        bookList.addBook(new Book("Ang Babae sa Septic Tank", "Nigell Alfeche", "February 20, 2050"));
        bookList.addBook(new Book("Harry Potter: and the Sexbomb Dancer", "Rochelle Pangilinan", "December 5, 1989"));
        bookList.addBook(new Book("Salt", "Knor Cubes", "April 7, 1998"));
        bookList.addBook(new Book("Salt", "Nigell Alfeche", "December 16, 1669"));
        bookList.addBook(new Book("K-pop Mo!", "Lilian Cunanan", "November 1, 1969"));
        bookList.addBook(new Book("Isagad Mo Lang", "Jezza Vinalon", "December 16, 1889"));
        bookList.addBook(new Book("Init sa Tag-lamig", "James Joyce", "November 6, 1666"));
        bookList.addBook(new Book("Hannah Bakeshop", "NigelL Alfeche", "200 B.C."));
        bookList.addBook(new Book("Kigwa!", "Nigell Alfeche", "August 16, 8878"));
        
        System.out.println(" _________________________________________________________");
        System.out.println("|_______________ D E B Y ' S  L I B R A R Y ______________|");
        System.out.println("|_________________________________________________________|\n");

        System.out.println("|==================== BOOKS AVAILABLE ====================|");
        bookList.sortByTitle();
        System.out.println(bookList);
        
        System.out.println("|==================== SORT BY AUTHOR ========+============|");
        bookList.sortByAuthor();
        System.out.println(bookList);
        System.out.println("|=========================================================|");

        System.out.println("|==================== AUTHORS & BOOKS ====================|\n");
        System.out.println("|================ Books of NIGELL ALFECHE ================|");
        System.out.println(bookList.filter("Nigell Alfeche"));
        System.out.println("|================== Books of JAMES JOYCE =================|");
        System.out.println(bookList.filter("James Joyce"));
        System.out.println("|================ Books of JEZZA VINALON ============+====|");
        System.out.println(bookList.filter("Jezza Vinalon"));
        System.out.println("|================== Books of KNOR CUBES ==================|");
        System.out.println(bookList.filter("Knor Cubes"));
        System.out.println("|================ Books of LILIAN CUNANAN ================|");
        System.out.println(bookList.filter("Lilian Cunanan"));
        System.out.println("|============= Books of MIGUEL DE CERVANTES ==============|");
        System.out.println(bookList.filter("Miguel de Cervantes"));
        System.out.println("|============= Books of ROCHELLE PANGILINAN ==============|");
        System.out.println(bookList.filter("Rochelle Pangilinan"));
        System.out.println("|=========================================================|");
        
    }
}
