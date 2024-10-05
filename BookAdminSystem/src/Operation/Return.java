package Operation;

import Book.BookList;
import Book.Book;
public class Return implements operation{
    public void work(BookList bookList){
        System.out.println("Return the book.");
        System.out.println("Please enter the name of the book you want to return: ");
        String name=input.nextLine();
        int book_stored= bookList.getBook_stored();
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name) && book.isborrowed()) {
                book.setIsborrowed(false);
                System.out.println("Return the book successfully.");
                return;
            }
        }
    }
    public String work(BookList bookList,String name){
        int book_stored= bookList.getBook_stored();
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name) && book.isborrowed()) {
                book.setIsborrowed(false);
                return"Return the book successfully.";
            }
        }
        return"Return the book fail.";
    }
}
