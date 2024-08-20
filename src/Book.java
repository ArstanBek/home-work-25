public class Book {
    private String name;
    private String code;
    private String author;
    private int year;

    public Book() {

    }

    public Book(String name, String code, String author, int year) {
        this.name = name;
        this.code = code;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
