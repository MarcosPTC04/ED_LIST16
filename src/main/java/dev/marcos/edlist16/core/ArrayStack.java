package dev.marcos.edlist16.core;

public class ArrayStack<T> implements Stack<T> {

    private T[] items;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        items = (T[]) new Object[10];
        top = -1;
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        items = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T element) {
        ensureCapacity();
        items[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        T element = items[top];
        items[top] = null;
        top--;

        return element;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return items[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            items[top--] = null;
        }
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (top == items.length - 1) {
            T[] newItems = (T[]) new Object[items.length * 2];

            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
    }
}
