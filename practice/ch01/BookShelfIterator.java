
import java.util.Iterator;

import ch01.Sample.BookShelf;

// 책꽂이에서 책을 한 권씩 꺼내오는 반복자 
public class BookShelfIterator implements Iterator<Book> {

    private Book bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookshelf) {
        this.bookShelf = bookshelf;
        this.index = bookshelf.getLength();
    }

    @Override
    // 꺼내올 원소가 더 있는지 검사하는 메소드
    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        } else
            return false;

    }

    @Override
    // 다음 원소를 꺼내오는 메소드
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;

    }

}