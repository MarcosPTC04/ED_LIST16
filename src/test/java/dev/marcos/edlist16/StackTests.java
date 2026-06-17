package dev.marcos.edlist16;

import dev.marcos.edlist16.core.ArrayStack;
import dev.marcos.edlist16.core.DualStack;
import dev.marcos.edlist16.core.LinkedStack;
import dev.marcos.edlist16.core.QueueStack;

public class StackTests {

    public static void main(String[] args) {

        System.out.println("=== ArrayStack ===");

        ArrayStack<Integer> arrayStack = new ArrayStack<>(3);

        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);

        System.out.println("Topo: " + arrayStack.top());
        System.out.println("Tamanho: " + arrayStack.size());
        System.out.println("Removido: " + arrayStack.pop());

        System.out.println();

        System.out.println("=== LinkedStack ===");

        LinkedStack<String> linkedStack = new LinkedStack<>();

        linkedStack.push("A");
        linkedStack.push("B");
        linkedStack.push("C");

        System.out.println("Topo: " + linkedStack.top());
        System.out.println("Removido: " + linkedStack.pop());
        System.out.println("Novo topo: " + linkedStack.top());

        System.out.println();

        System.out.println("=== QueueStack ===");

        QueueStack<Integer> queueStack = new QueueStack<>();

        queueStack.push(100);
        queueStack.push(200);
        queueStack.push(300);

        System.out.println("Topo: " + queueStack.top());
        System.out.println("Removido: " + queueStack.pop());
        System.out.println("Novo topo: " + queueStack.top());

        System.out.println();

        System.out.println("=== DualStack ===");

        DualStack dualStack = new DualStack(8);

        dualStack.pushA(1);
        dualStack.pushA(2);

        dualStack.pushB(10);
        dualStack.pushB(20);

        System.out.println("Topo A: " + dualStack.topA());
        System.out.println("Topo B: " + dualStack.topB());

        System.out.println("Removido A: " + dualStack.popA());
        System.out.println("Removido B: " + dualStack.popB());
    }
}