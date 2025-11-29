package ArrayListTest;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void priceInfo() {
        System.out.println("제목: " + this.title + " 저자: " + this.author + " 대여료: " + this.price + "원");
    }
}
