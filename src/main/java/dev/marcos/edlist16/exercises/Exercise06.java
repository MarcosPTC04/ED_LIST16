package dev.marcos.edlist16.exercises;

import dev.marcos.edlist16.core.LinkedStack;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise06 {

    public static boolean isPalindrome(String text) {

        Queue<Character> queue = new LinkedList<>();
        LinkedStack<Character> stack = new LinkedStack<>();

        text = text.replaceAll("\\s+", "").toUpperCase();

        for (char c : text.toCharArray()) {
            queue.offer(c);
            stack.push(c);
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word1 = "ARARA";
        String word2 = "JAVA";

        System.out.println(word1 + ": " + isPalindrome(word1));
        System.out.println(word2 + ": " + isPalindrome(word2));
    }
}