package eneity;

import iterator.Aggregate;
import iterator.BookShelfIterator;
import iterator.Iterator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/8.
 */
public class BookShelf implements Aggregate<Book>{
    private ArrayList<Book> books = new ArrayList<>();

    public void appendBook(Book book){
        books.add(book);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public int getSize(){
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
