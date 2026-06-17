package dev.marcos.edlist16.core;

public class DualStack {

    private int[] items;
    private int topA;
    private int topB;

    public DualStack(int capacity) {
        items = new int[capacity];
        topA = -1;
        topB = capacity;
    }

    public void pushA(int element) {
        if (topA + 1 == topB) {
            throw new RuntimeException("Stack Overflow");
        }

        items[++topA] = element;
    }

    public void pushB(int element) {
        if (topA + 1 == topB) {
            throw new RuntimeException("Stack Overflow");
        }

        items[--topB] = element;
    }

    public int popA() {
        if (topA == -1) {
            throw new RuntimeException("Stack A Underflow");
        }

        return items[topA--];
    }

    public int popB() {
        if (topB == items.length) {
            throw new RuntimeException("Stack B Underflow");
        }

        return items[topB++];
    }

    public int topA() {
        if (topA == -1) {
            throw new RuntimeException("Stack A is Empty");
        }

        return items[topA];
    }

    public int topB() {
        if (topB == items.length) {
            throw new RuntimeException("Stack B is Empty");
        }

        return items[topB];
    }

    public boolean isEmptyA() {
        return topA == -1;
    }

    public boolean isEmptyB() {
        return topB == items.length;
    }
}
