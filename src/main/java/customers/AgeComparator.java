package customers;

import java.util.Comparator;

public class AgeComparator<T extends AgeComparable> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
