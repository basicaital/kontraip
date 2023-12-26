package Task3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBooks(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public void showLib(){
        for (Book book:books){
            System.out.println("Название: "+book.getTitle()+", автор: "+book.getAuthor()+", год: "+book.getYear());
        }
    }
}
