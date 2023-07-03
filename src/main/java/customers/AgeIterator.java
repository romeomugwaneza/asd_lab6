package customers;

import java.util.Iterator;
import java.util.List;

public class AgeIterator<T extends AgeComparable> implements Iterator<T> {
    private final List<T> list;
    private int position;
    public AgeIterator(List<T> list) {
        this.list = list;
        this.position = position = 0;
        this.list.sort(new AgeComparator<>());
    }
    public AgeIterator<T> iterator(){
        return this;
    }


    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        return list.get(position++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
