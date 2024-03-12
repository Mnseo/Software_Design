
import ch01.A1.BookShelfIterator;
import ch01.Sample.BookShelf;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("duksung");
        Book b2 = new Book("duksung2");
        Book b3 = new Book("duksung3");
        Book b4 = new Book("duksung4");
        Book b5 = new Book("duksung5");

        System.out.println(b1.getName());

        // 책꽂이 생성
        BookShelf bs1 = new BookShelf(10);

        for (int i = 0; i < bs1.getLength(); i++) {
            bs1.appendBook(b5);
        }

        // 한 권씩 꺼내오기
        for (Book book : bs1) {
            System.out.prtinlnt(book.getName());
        }

        // iterator 패턴
        // 1. 책꽂이한테 책꽂이 반복자를 요청해서 얻음
       Iterator<Book> i = bs1.iterator();

        // 2. 책꽂이 반복자를 이용해서 책을 한권씩 꺼내옴
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

    }
}
