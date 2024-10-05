package Operation;

import Book.BookList;
import Book.Book;

public class Show implements operation {//显示当前图书库中的所有书籍信息

    public void work(BookList bookList) {
        int book_stored = bookList.getBook_stored();
        for (int i = 0; i < book_stored; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }

    public String work(BookList bookList, Boolean a) {
        String information = "";
        int book_stored = bookList.getBook_stored();
        for (int i = 0; i < book_stored; i++) {
            Book book = bookList.getBooks(i);
            information += book;
            information += "\n";
        }
        return information;
    }
}
