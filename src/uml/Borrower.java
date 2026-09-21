package uml;

public class Borrower {
    private String id;
    private String name;
    private Book book;

    public Borrower(String id, String name) {
        this.id = id;
        this.name = name;
        this.book = null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
