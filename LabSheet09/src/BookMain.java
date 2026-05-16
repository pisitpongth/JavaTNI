public class BookMain {
    public static void main(String[] args) {
        Author author = new Author("Malee Aroina", "Thai", 2005);
        Book book = new Book("Java Programming", "Programming Language", 375.25, author);

        System.out.println(author.showAuthorInfo());

        System.out.println();

        System.out.println(book.showBookInfo());
    }
}
