import java.util.Date;
import java.util.List;
public class eBook extends Book {
    private String format;

    public eBook(String title, String author, String isbn, Date dueDate, List<String> categories, String format) {
        super(title, author, isbn, dueDate, categories);
        this.format = format;
    }
}
