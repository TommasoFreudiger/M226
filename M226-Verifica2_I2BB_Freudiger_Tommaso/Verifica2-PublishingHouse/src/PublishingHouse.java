import java.util.ArrayList;

public class PublishingHouse {
    private String name;
    private String address;
    private ArrayList<Book> Books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Publishing House{" +
                "Name='" + name + '\'' +
                ", Address=" + address +
                ", Books=" + Books +
                '}';
    }

    public void addBook(Book book) {
        Books.add(book);
    }

    public PublishingHouse(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
