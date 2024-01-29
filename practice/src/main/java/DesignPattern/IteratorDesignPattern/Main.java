package DesignPattern.IteratorDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = List.of(new Book("A"), new Book("B"), new Book("C"));
        Library library = new Library(bookList);

        //client code
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
