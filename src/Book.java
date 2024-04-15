import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1900 || publishingYear > LocalDate.now().getYear()) {
            System.out.println("Неверный год публикации:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return bookName + " " + publishingYear + " г. " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||

                getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }
}