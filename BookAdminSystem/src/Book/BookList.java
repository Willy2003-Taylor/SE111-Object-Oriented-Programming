package Book;

public class BookList {
    private Book[] books = new Book[10];
    private int book_stored;

    public BookList() {
        books[0] = new Book("The Kite Runner", "Khaled Hosseini", 56, "novel");
        books[1] = new Book("Little Women", "Louisa May Alcott", 20, "novel");
        books[2] = new Book("The Count of Monte Cristo", "Alexandre Dumas", 20, "novel");
        books[3] = new Book("Les Miserables", "Victor Hugo", 30, "novel");
        books[4] = new Book("Beyond the Wand", "Tom Felton", 98, "novel");
        this.book_stored = 5;
    }

    public void setBook_stored(int book_stored) {
        this.book_stored = book_stored;
    }

    public int getBook_stored() {
        return book_stored;
    }

    public void setBooks(int position, Book book){//将一本书放到指定位置上
        if(position<0 || position>getBook_stored())
            return;
        books[position]=book;
    }

    public Book getBooks(int position){//得到指定位置上的一本书
        if (position < 0 || position > getBook_stored()) {
            System.out.println("The position is illegal.");
            return null;
        }
        return books[position];
    }
}