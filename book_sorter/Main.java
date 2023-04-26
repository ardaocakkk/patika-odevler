import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookshelf = new TreeSet<>();

        bookshelf.add(new Book("Suc ve Ceza", 687, "Fyodor Dostoyevski", "1866"));
        bookshelf.add(new Book("Yeraltindan Notlar", 151, "Fyodor Dostoevski", "1864" ));
        bookshelf.add(new Book("Notre Dame'in Kamburu" , 547, "Victor Hugo", "1831"));
        bookshelf.add(new Book("Beyaz Zambaklar Ulkesinde", 240, "Grigory Petrov", "1932"));

        for(Book b : bookshelf) {
            System.out.println(b.getName() + " " + b.getAuthor() + " " + b.getPageNum());
        }


    }
}