
import java.util.Iterator;


// 책꽂이에서 책을 한 권씩 꺼내오는 반복자 
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookshelf2) {
        this.bookShelf = bookshelf2;
        this.index = bookShelf.getLength();
    }

    @Override
    // 꺼내올 원소가 더 있는지 검사하는 메소드
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
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