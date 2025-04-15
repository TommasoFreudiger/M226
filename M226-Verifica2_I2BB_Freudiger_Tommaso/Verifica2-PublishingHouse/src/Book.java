public class Book {
    private String title;
    private String author;
    private String genre;
    private Integer stock;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() { return genre; }

    public Integer getStock() { return stock; }

    public void addStock() { stock += 1; }

    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author=" + author +
                ", Genre=" + genre +
                ", Stock=" + stock +
                '}';
    }

    public Book(String title, String author, String genre, Integer stock) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.stock = stock;
    }
}
