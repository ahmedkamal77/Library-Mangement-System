package library.management.system;

public abstract class abstractbook {

    static int no_of_books = 0;
    protected boolean state = true;
    protected String book_name;
    protected String book_type;
    protected String author;

    public abstractbook(String book_name, String book_type, String author) {
        this.book_name = book_name;
        this.book_type = book_type;
        this.author = author;
        no_of_books++;
    }

    public abstract void display_all();

    public abstract void setState(boolean state);

    public abstract boolean search(String bookname);

}
