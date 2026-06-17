package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.ArrayStack;

public class Exercise02 {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Topo: " + stack.top());
        System.out.println("Tamanho: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Removido: " + stack.pop());
        }
    }
}