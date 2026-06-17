package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.QueueStack;

public class Exercise01 {

    public static void main(String[] args) {

        QueueStack<Integer> stack = new QueueStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Topo: " + stack.top());
        System.out.println("Removido: " + stack.pop());
        System.out.println("Novo topo: " + stack.top());
        System.out.println("Tamanho: " + stack.size());
        System.out.println("Vazia? " + stack.isEmpty());
    }
}
