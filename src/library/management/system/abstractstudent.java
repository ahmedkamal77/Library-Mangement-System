package library.management.system;

public abstract class abstractstudent {

    static int no_of_students = 0;
    protected String Student_name;
    protected int ID;
    protected String Phone_number;
    protected String date;
    protected String book_name;

    public abstractstudent(String Student_name, int ID, String Phone_number, String date, String book_name) {
        this.Student_name = Student_name;
        this.ID = ID;
        this.Phone_number = Phone_number;
        this.date = date;
        this.book_name = book_name;
        no_of_students++;
    }

    public abstract void display_all();

    public abstract boolean search(String studentname);

}
