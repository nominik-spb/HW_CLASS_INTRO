public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (title.contains(word) || author.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = 0;
        price = (pages * 3) >= 250 ? pages * 3 : 250;
        return price;
    }

    public String toString() {
        return "Книга '" + title + "' (" + author + ", " + releaseYear + " год)";
    }
}
