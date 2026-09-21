package uml;

public class Book {
    private String isbn;
    private String title;
    private short year;
    private boolean isAvailable;

    public Book(String isbn){
        this.isbn = isbn;
        this.title = "";
        this.year  = 0;
        this.isAvailable = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public short getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void borrowBook(){
        if(!isAvailable){
            System.out.println("Book unavailable");
            return;
        }
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }
}
