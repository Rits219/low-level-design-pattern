package DesignPattern.IteratorDesignPattern;

import java.util.List;

public class Library {
    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }


    public BookIterator createIterator() {
        return new BookIterator(bookList);
    }
}
