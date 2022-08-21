public class Book {
    private static String title;
    private static String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public static Book of(String title,String author){
        return new Book(title, author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book{" + "title='" + title +'\'' + ", author='" + author + '\'' +
                '}';
    }
}