package ArrayListTest;

public class BookList {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("이것이 자바다", "홍길동", 500));
        library.addBook(new Book("자료구조와 알고리즘", "김영희", 1200));
        library.addBook(new Book("객체 지향 디자인", "박철수", 800));
        library.addBook(new Book("클린 코드", "로버트 마틴", 1000));
        library.addBook(new Book("Head First Java", "Kathy Sierra", 750));

        System.out.println("======= 등록된 도서 목록 (" + library.getBookCount() + "권) =======");
        for (int i = 0; i < library.getBookCount(); i++) {
            System.out.print((i + 1) + ". ");
            library.getBooks(i).priceInfo();
        }
        System.out.println("========================================================");
    }
}
