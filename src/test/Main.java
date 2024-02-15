package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        Shape shape1 = new Circle();
//        System.out.println("Circle area: " + shape1.calculateArea(17, 0));
//        Shape shape2 = new Rectangle();
//        System.out.println("Rectangle area: " + shape2.calculateArea(17, 18));
//
//
//        List<Vehicle> vehicles = new ArrayList<>();
//        vehicles.add(0, new Car());
//        vehicles.add(1, new Motorcycle());
//        vehicles.forEach(element -> System.out.println(element.startEngine()));
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        libraryCatalog.addBook(new Book("title1", "author1", "1", true));
        libraryCatalog.addBook(new Book("atitle2", "author2", "2", false));
        libraryCatalog.addBook(new Book("title2", "author1", "3", true));
        System.out.println("add: " + libraryCatalog.listBooks());
        libraryCatalog.removeBook("1");
        System.out.println("remove: " + libraryCatalog.listBooks());
        libraryCatalog.checkOutBook("2");
        libraryCatalog.checkInBook("2");
        System.out.println("all: " + libraryCatalog.listBooks());
    }
}
