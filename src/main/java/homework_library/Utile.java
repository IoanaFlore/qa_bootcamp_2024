package homework_library;
public class Utile{

    public static void printBook(Book bq){
        System.out.println("Book " + bq.getName() + " (" + bq.getPrice() + " RON " + ") "  + ","
        + " by " + bq.getAuthor().getName() + " , " + " published in " + bq.getYear());
    }
}

