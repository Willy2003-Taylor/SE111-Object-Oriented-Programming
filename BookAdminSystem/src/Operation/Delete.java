package Operation;

import Book.BookList;
import Book.Book;

public class Delete implements operation{
    public void work(BookList bookList){
        System.out.println("Delete the book.");
        System.out.println("Please enter the name of the book you want to delete: ");
        String name=input.nextLine();
        int book_stored= bookList.getBook_stored();
        int index=-1;
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                index=i;
                break;
            }
        }
        for(int i=index;i<book_stored-1;i++){
            Book book=bookList.getBooks(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setBook_stored(book_stored-1);
        bookList.setBooks(book_stored-1,null);
    }
    public void work(BookList bookList,String name){
        int book_stored= bookList.getBook_stored();
        int index=-1;
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                index=i;
                break;
            }
        }
        for(int i=index;i<book_stored-1;i++){
            Book book=bookList.getBooks(i+1);
            bookList.setBooks(i,book);
        }
        bookList.setBook_stored(book_stored-1);
        bookList.setBooks(book_stored-1,null);
    }
}