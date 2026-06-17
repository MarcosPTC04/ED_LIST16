package dev.marcos.edlist16.core;

public class LinkedStack<T> implements Stack<T> {

    private StackNode<T> top;
    private int size;

    @Override
    public void push(T element) {
        StackNode<T> newNode = new StackNode<>(element);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        T element = top.getData();
        top = top.getNext();
        size--;

        return element;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return top.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }
}
