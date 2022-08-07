package library.management.system;

public class student extends abstractstudent {

    public student(String Student_name, int ID, String Phone_number, String date, String book_name) {
        super(Student_name, ID, Phone_number, date, book_name);
    }

    @Override
    public void display_all() {
        System.out.println(Student_name + " " + ID + " " + Phone_number + " " + date + " " + book_name);
    }

    public String getStudent_name() {
        return Student_name;
    }

    public int getID() {
        return ID;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public String getDate() {
        return date;
    }

    public String getBook_name() {
        return book_name;
    }

    public static void remove_element(student[] array, int index) {
        student[] array2 = new student[no_of_students - 1];

    }

    @Override
    public boolean search(String studentname) {
        if (studentname == this.Student_name) {
            return true;
        } else {
            return false;
        }

    }

}
