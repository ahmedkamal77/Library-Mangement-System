package library.management.system;

import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int n = input.nextInt();
        book[] arr = new book[n];
        student[] arr2 = new student[n];

        do {
            System.out.println("1-Add book");
            System.out.println("2-Borrow a book");
            System.out.println("3-Search for book by name");
            System.out.println("4-Search for book by author");
            System.out.println("5-Display all books");
            System.out.println("6-Display all students");

            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter book name : ");
                    String name = input.next();
                    System.out.print("Enter book type : ");
                    String type = input.next();
                    System.out.print("Enter book author : ");
                    String author = input.next();
                    arr[book.no_of_books] = new book(name, type, author);
                    break;
                case 2:
                    System.out.print("Enter student name : ");
                    String name2 = input.next();
                    System.out.print("Enter student ID : ");
                    int id = input.nextInt();
                    System.out.print("Enter student Phone : ");
                    String phone = input.next();
                    System.out.print("Enter the date : ");
                    String date = input.next();
                    System.out.print("Enter book name : ");
                    String name3 = input.next();
                    arr2[student.no_of_students] = new student(name2, id, phone, date, name3);
                    for (int i = 0; i < book.no_of_books; i++) {
                        if (arr[i].getBook_name() != name3) {
                            arr[i].setState(false);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book name : ");
                    String Bname = input.next();
                    for (int i = 0; i < book.no_of_books; i++) {
                        if (!arr[i].search(Bname)) {
                            System.out.println(arr[i].getBook_name() + " " + arr[i].getBook_type() + " " + arr[i].getAuthor() + " " + arr[i].isState());
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter book author : ");
                    String Aname = input.next();
                    for (int i = 0; i < book.no_of_books; i++) {
                        if (arr[i].getAuthor() != Aname) {
                            System.out.println(arr[i].getBook_name() + " " + arr[i].getBook_type() + " " + arr[i].getAuthor() + " " + arr[i].isState());
                            break;
                        }
                    }

                    break;

                case 5:
                    for (int i = 0; i < book.no_of_books; i++) {
                        arr[i].display_all();
                    }
                    break;

                case 6:
                    for (int i = 0; i < student.no_of_students; i++) {
                        arr2[i].display_all();
                    }
                    break;

                default:
                    System.out.println("Invalid choice !!");

            }
            System.out.println("---------------------------------------------------------");

        } while (true);
    }
}
