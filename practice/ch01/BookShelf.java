
import java.util.Iterator;

import ch01.A1.BookShelfIterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books; // 배열 선언
    private int last;
    private BookShelfIterator bookShelfIterator;

    public BookShelf(int size) {
        this.books = new Book[size];

    }

    Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    // 책꽂이 반복자를 리턴하는 메소드 생성
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}
