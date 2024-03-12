package ch01.A1.Code;

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

        for(int i = 0; i < bs1.getLength(); i++) {
            bs1.appendBook(b5);
        }

        // 한 권씩 꺼내오기
        for(Book book: bs1) {
            book.getName();
        }

        // iterator 패턴 
        
    
    }
}
