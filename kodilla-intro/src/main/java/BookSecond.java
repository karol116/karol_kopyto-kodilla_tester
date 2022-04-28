public class BookSecond {
    private String author;
    private String title;

    public static BookSecond of(String author, String title) {
        BookSecond book = new BookSecond();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
        BookSecond bookSecond = BookSecond.of("Jeremy Clarson", "Whatever");

        System.out.println(bookSecond.author + "  " + bookSecond.title);
    }
}