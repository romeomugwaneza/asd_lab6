package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SkipIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int position;

    public SkipIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }
    public Iterator<T> iterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        return position < list.size() - 1;
    }

    @Override
    public T next() {
        position = position + 1;
        return list.get(position++);
    }
}
