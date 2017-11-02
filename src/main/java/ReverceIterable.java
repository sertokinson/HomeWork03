import java.util.Iterator;
import java.util.List;

public class ReverceIterable<T> implements Iterable {
    final List<T> list;
     ReverceIterable(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<List> iterator() {
        return new ReverceIterator(list);
    }
}
