package Operation;

import Book.Book;
import Book.BookList;

public class Add implements operation {
    public void work(BookList bookList){
        System.out.println("Add a new book.");
        System.out.println("Please enter the name of the book you added: ");
        String name=input.nextLine();
        System.out.println("Please enter the author of the book.");
        String author=input.nextLine();
        System.out.println("Please enter the price of the book.");
        int price=input.nextInt();
        System.out.println("Please enter the type of the book.");
        String type=input.nextLine();
        Book book = new Book(name, author, price, type);//信息录入完成以后创建一本书
        int book_stored=bookList.getBook_stored();
        bookList.setBooks(book_stored, book);
        for(int i=0;i<book_stored;i++){
            Book tmp=bookList.getBooks(i);
            if(book.getName().equals(tmp)){
                System.out.println("The book has existed.");
                return;
            }
        }
        //因为数组下标起点为0 所以在加入书之前最后一本书的位置是book_stored-1 因此加入的这本书就放在book_stored位置上
        bookList.setBook_stored(book_stored+1);
        System.out.println("Add the book successfully.");
    }
    public String work(BookList bookList,String name,String author,int price,String type){//窗口用添加
        Book book = new Book(name, author, price, type);//信息录入完成以后创建一本书
        int book_stored=bookList.getBook_stored();
        bookList.setBooks(book_stored, book);
        for(int i=0;i<book_stored;i++){
            Book tmp=bookList.getBooks(i);
            if(book.getName().equals(tmp.getName())){
                return "The book has existed.";
            }
        }
        bookList.setBook_stored(book_stored+1);
        return "Add the book successfully.";
    }
}
