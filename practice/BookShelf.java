package ch01.A1.Code;

public class BookShelf {
    private Book[] books; // 배열 선언
    private int last;

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

}
