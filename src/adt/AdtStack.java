package adt;

public interface AdtStack<E> {

    E peek();

    E pop();

    boolean isEmpty();

    void push(E item);

}
