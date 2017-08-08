package main;

import eneity.Book;
import eneity.BookShelf;
import iterator.BookShelfIterator;
import iterator.Iterator;

/**
 * Description: 迭代器模式——IteratorMode
 * Created by Administrator on 2017/8/8.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Super Man"));
        bookShelf.appendBook(new Book("WarCraft"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println("BookShelf Size:" + bookShelf.getSize());
    }
}
