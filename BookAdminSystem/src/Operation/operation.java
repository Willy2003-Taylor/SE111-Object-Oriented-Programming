package Operation;

import Book.BookList;

import java.util.Scanner;

public interface operation {
    Scanner input=new Scanner(System.in);
    public void work(BookList bookList);
}
