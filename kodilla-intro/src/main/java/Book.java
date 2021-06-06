public class Book {
    private String author;
    private String title;

    public static Book of (String author, String title) {
        return new Book (author, title);
    }

    public Book (String author, String title) {
        Book book = Book.of("Isaac Assimov", "Galaxy");
        }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Assimov", "Galaxy");
        System.out.println(book);
    }
}