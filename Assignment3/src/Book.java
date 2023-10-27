import java.util.Date;
import java.util.List;
public class Book {
    private String title;
    private String author;
    private String isbn;
    Date dueDate;
    private List<String> categories;

    public Book(String title, String author, String isbn, Date dueDate, List<String> categories) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.dueDate = dueDate;
        this.categories = categories;
    }


    public Date getDueDate() {
        return null;
    }
}
