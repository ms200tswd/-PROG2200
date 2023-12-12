import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("Book 1", "Author 1", "ISBN-1", null, List.of("Fiction"));
        eBook book2 = new eBook("eBook 1", "Author 2", "ISBN-2", null, List.of("Non-Fiction"), "EPUB");
        library.addBook(book1);
        library.addBook(book2);

        // Create users
        LibraryUser student = new Student("Student 1");
        LibraryUser teacher = new Teacher("Teacher 1");

        // Student borrows a book
        student.borrowBook(book1);

        // Teacher borrows a book
        teacher.borrowBook(book2);

        // Check for overdue books and send notifications
        Date currentDate = new Date();
        for (LibraryUser user : List.of(student, teacher)) {
            for (Book book : user.getBorrowedBooks()) {
                if (book.getDueDate() != null && currentDate.after(book.getDueDate())) {
                    NotificationService notificationService = new EmailNotificationService(); // You can choose SMS or Email
                    notificationService.sendNotification(user, book);
                }
            }
        }
    }
}
