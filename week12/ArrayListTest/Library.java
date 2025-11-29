package ArrayListTest;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("도서 등록 완료: " + book.getTitle());
    }

    public int getBookCount() {
        return this.books.size();
    }

    public Book getBooks(int index) {
        return this.books.get(index);
    }
}
