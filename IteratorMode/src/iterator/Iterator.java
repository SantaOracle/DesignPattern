package iterator;

/**
 * Created by Administrator on 2017/8/8.
 */
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
