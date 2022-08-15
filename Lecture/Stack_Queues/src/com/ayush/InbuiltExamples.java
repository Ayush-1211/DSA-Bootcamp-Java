package com.ayush;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(30);
//        stack.push(20);
//        stack.push(10);
//        stack.push(90);
//        stack.push(40);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(30);
//        queue.add(20);
//        queue.add(10);
//        queue.add(90);
//        queue.add(40);
//
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(98);
        deque.addLast(45);
        deque.removeFirst();
    }
}
