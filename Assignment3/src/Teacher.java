import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Teacher implements LibraryUser{
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(Book book) {
        book.dueDate = new Date(new Date().getTime() + 30 * 24 * 60 * 60 * 1000); // 30 days
        borrowedBooks.add(book);
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.dueDate = null;
        }
    }

    @Override
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
