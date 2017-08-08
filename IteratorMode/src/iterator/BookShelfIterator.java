package iterator;

import eneity.Book;
import eneity.BookShelf;

/**
 * Created by Administrator on 2017/8/8.
 */
public class BookShelfIterator implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getSize()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
