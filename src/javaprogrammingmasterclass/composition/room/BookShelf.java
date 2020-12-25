package javaprogrammingmasterclass.composition.room;

import java.util.List;

public class BookShelf {

    private List<Book> book;

    private Book takeBook(Book book) {
        return this.book.remove(
                this.book.indexOf(book));
    }

    public BookShelf(List<Book> book) {
        this.book = book;
    }
}
