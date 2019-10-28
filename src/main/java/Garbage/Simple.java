package Garbage;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Simple<E> implements Iterable<E> {
    boolean add(E e) {
        return false;
    }

    void delete(int index) {

    }

    E get(int index) {
        return null;
    }

    int size() {
        return 0;
    }

    void update(int index, E e) {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }
}
