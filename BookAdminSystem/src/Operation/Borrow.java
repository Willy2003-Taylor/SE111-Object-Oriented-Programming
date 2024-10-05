package Operation;

import Book.Book;
import Book.BookList;

public class Borrow implements operation {
    public void work(BookList bookList){
        System.out.println("Borrow the book.");
        System.out.println("Please enter the name of book you want to borrow: ");
        String name=input.nextLine();
        int book_stored= bookList.getBook_stored();
        int j=0;
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name) && !book.isborrowed()){
                System.out.println("Borrow the book successfully.");
                book.setIsborrowed(true);
                j++;
            }

        }
        if(j !=1){
            System.out.println("Can't find book.");
        }
    }
   public String work(BookList bookList,String name){
        int book_stored= bookList.getBook_stored();
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name) && !book.isborrowed()){
                book.setIsborrowed(true);
                System.out.println("Ok");
                return "Borrow the book successfully.";
            }
        }
        System.out.println("not");
        return "Can't find book.";
    }
}
