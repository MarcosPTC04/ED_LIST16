package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.LinkedStack;

public class Exercise04 {

    public static void main(String[] args) {

        LinkedStack<String> stack = new LinkedStack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Topo: " + stack.top());

        while (!stack.isEmpty()) {
            System.out.println("Removido: " + stack.pop());
        }

        System.out.println("Pilha vazia? " + stack.isEmpty());
    }
}
