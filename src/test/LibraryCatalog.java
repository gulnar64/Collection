package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCatalog {
   private Map<String, Book> catalog = new HashMap<>();

    public Map<String, Book> getCatalog() {
        return catalog;
    }



    public LibraryCatalog() {

    }
    public void addBook(Book book) {
        catalog.put(book.getIsbn(), book);

    }
    public Book removeBook(String isbn) {
        return catalog.remove(isbn);
    }
    public Book getBook(String isbn) {
        return catalog.get(isbn);
    }
    public List<Book> listBooks() {
        return catalog.values().stream().sorted(Comparator.comparing(Book::getTitle)).toList();
    }
    public void checkOutBook(String isbn) {
        Book book = getBook(isbn);
        if(book != null && !book.isAvailable()) {
            System.out.println("Artiq false-dir");
        }
        else if(book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Ughurla deyishdirildi");
        }
        else {
            System.out.println("Bele kitab yoxdur");
        }

    }
    public void checkInBook(String isbn) {
        Book book = getBook(isbn);
        book.setAvailable(true);
    }

}
