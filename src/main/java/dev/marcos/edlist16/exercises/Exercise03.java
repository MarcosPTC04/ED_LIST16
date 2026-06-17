package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.DualStack;

public class Exercise03 {

    public static void main(String[] args) {

        DualStack stack = new DualStack(10);

        stack.pushA(10);
        stack.pushA(20);
        stack.pushA(30);

        stack.pushB(100);
        stack.pushB(200);
        stack.pushB(300);

        System.out.println("Topo Pilha A: " + stack.topA());
        System.out.println("Topo Pilha B: " + stack.topB());

        System.out.println("Removido A: " + stack.popA());
        System.out.println("Removido B: " + stack.popB());

        System.out.println("Novo Topo A: " + stack.topA());
        System.out.println("Novo Topo B: " + stack.topB());
    }
}