package com.bridgelabz.assignment;

import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        return stack.removeFirst();
    }

    public T peek() {
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class StackAndQueueDemo {
    public static void main(String[] args) {
        // Stack operations
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Queue operations
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("\nQueue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
