package Operation;

import Book.BookList;
import Book.Book;
public class Find implements operation{
    public void work(BookList bookList){
        System.out.println("Find the book.");
        System.out.println("Please enter the name of the book you want to find: ");
        String name =input.nextLine();
        int book_stored= bookList.getBook_stored();
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println("Find this book successfully");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Can't find this book.");
    }
    public String work(BookList bookList,String name){//窗口用查找
        int book_stored= bookList.getBook_stored();
        for(int i=0;i<book_stored;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name))
            {
                return book.toString();
            }
        }
        return "Can't find this book.";
    }
}