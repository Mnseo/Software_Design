
import java.util.Iterator;
import java.util.*;

public class BookShelf implements Iterable<Book> {
    //private Book[] books;
    private List<Book> books; // 배열 선언
    private int last = 0;
    private Iterator bookShelfIterator;

    public BookShelf(int size) {
        //배열 생성
        //this.books = new Book[size];

        //ArrayList 생성
        this.books = new ArrayList<Book>(size);

    }

    Book getBookFrom(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return books.size();
    }

    // 책꽂이 반복자를 리턴하는 메소드 생성
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}
