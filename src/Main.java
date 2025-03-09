public class Main {

    public static void printBook(Book book) {
        System.out.println("_________________________________________________");
        System.out.println(book);
        System.out.println("Это большая книга?: " + book.isBig());
        System.out.println("Эта книга содержит слово 'Михаил'?: " + book.matches("Михаил"));
        System.out.println("Сколько стоит эта книга? " + book.estimatePrice() + " руб.");
    }

    public static void main(String[] args) {
        Author author1 = new Author("Булгаков", "Михаил", 8);
        Author author2 = new Author("Андерсен", "Ганс Христиан", 6);
        Author author3 = new Author("Толстой", "Лев", 10);

        Book book1 = new Book("Собачье сердце", 1968, author1, 159);
        Book book2 = new Book("Огниво", 1835, author2, 32);
        Book book3 = new Book("Война и мир", 1865, author3, 1408);

        printBook(book1);
        printBook(book2);
        printBook(book3);
    }
}
