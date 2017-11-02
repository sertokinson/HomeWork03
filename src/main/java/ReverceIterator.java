import java.util.Iterator;
import java.util.List;

public class ReverceIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int currentIndex;

    public ReverceIterator(List<T> list) {
        this.list = list;
        currentIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        return list.get(currentIndex--);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }

}
