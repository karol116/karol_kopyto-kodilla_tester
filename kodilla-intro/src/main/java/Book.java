public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        return author + title;
    }

    public static void main(String[] args) {
        Book.of("Małgorzata Rejmer", "Błoto słodsze niż miód");
    }
}
