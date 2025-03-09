public class Main {

    public static void printBook(Book book) {
        System.out.println("_________________________________________________");
        System.out.println(book);
        System.out.println("Это большая книга?: " + book.isBig());
        System.out.println("Эта книга содержит слово 'сердце'?: " + book.matches("сердце"));
        System.out.println("Сколько стоит эта книга? " + book.estimatePrice() + " руб.");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Собачье сердце", 1968, "Булгаков М.А.", 159);
        Book book2 = new Book("Огниво", 1835, "Андерсен Г.Х.", 32);
        Book book3 = new Book("Война и мир", 1865, "Толстой Л.Н.", 1408);

        printBook(book1);
        printBook(book2);
        printBook(book3);
    }
}
