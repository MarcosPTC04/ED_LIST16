package dev.marcos.edlist16.core;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack<T> implements Stack<T> {

    private Queue<T> queue1;
    private Queue<T> queue2;

    public QueueStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        queue2.offer(element);

        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        return queue1.poll();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return queue1.peek();
    }

    @Override
    public int size() {
        return queue1.size();
    }

    @Override
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public void clear() {
        queue1.clear();
        queue2.clear();
    }
}
