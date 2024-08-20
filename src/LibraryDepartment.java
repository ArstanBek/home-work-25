import java.util.Objects;

public class LibraryDepartment {
    private String name;
    private Book[] books = new Book[50];

    public LibraryDepartment() {
    }

    public LibraryDepartment(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Book findBookByAuthor(String author) {
        for (Book book:this.books) {
            if (Objects.equals(book.getAuthor(), author)) {
                return book;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
            }
        }
    }

    public int getBooksCount() {
        int count  = 0;
        for (Book book : this.books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }
}
