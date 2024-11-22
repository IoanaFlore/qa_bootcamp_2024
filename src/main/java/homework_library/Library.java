package homework_library;

public class Library {
    public static void main(String[] args) {
        Author authorDumistrecu = new Author("Andrei Dumitrescu", "andreidumitrescu@gmail.com");
        Book bookOrasulFaraNume = new Book("Orasul fara nume", 2000, authorDumistrecu, 46.89);
        Utile.printBook(bookOrasulFaraNume);

    }
}
