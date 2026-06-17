package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.LinkedStack;

public class Exercise05 {

    public static <T> void removeElement(LinkedStack<T> stack, T target) {

        LinkedStack<T> auxiliary = new LinkedStack<>();
        boolean removed = false;

        while (!stack.isEmpty()) {
            T element = stack.pop();

            if (!removed && element.equals(target)) {
                removed = true;
            } else {
                auxiliary.push(element);
            }
        }

        while (!auxiliary.isEmpty()) {
            stack.push(auxiliary.pop());
        }
    }

    public static void main(String[] args) {

        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        removeElement(stack, 30);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}