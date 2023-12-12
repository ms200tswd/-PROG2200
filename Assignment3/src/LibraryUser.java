import java.util.List;

interface LibraryUser {
    void borrowBook(Book book);

    void returnBook(Book book);

    List<Book> getBorrowedBooks();
}
