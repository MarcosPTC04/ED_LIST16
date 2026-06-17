package dev.marcos.edlist16.core;

public interface Stack<T> {

    void push(T element);

    T pop();

    T top();

    int size();

    boolean isEmpty();

    void clear();
}