package library.management.system;

public class book extends abstractbook {

    public book(String book_name, String book_type, String author) {
        super(book_name, book_type, author);
    }

    @Override
    public void display_all() {
        System.out.println(book_name + " " + book_type + " " + author + " " + state);
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    @Override
    public boolean search(String bookname) {
        if (bookname == this.book_name) {
            return true;
        } else {
            return false;
        }

    }

    public static int getNo_of_books() {
        return no_of_books;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_type() {
        return book_type;
    }

    public String getAuthor() {
        return author;
    }

}
