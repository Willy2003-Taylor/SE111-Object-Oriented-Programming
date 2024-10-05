package Operation;

import Book.BookList;
import Book.Book;
public class Exit implements operation {
    public void work(BookList booklist){
        System.out.println("Exit the system.");
        System.exit(0);
    }
}
