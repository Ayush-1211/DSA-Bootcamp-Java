package com.ayush;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.push(90);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());

        System.out.println("-------------------------------------");

        DynamicStack dynamicStack = new DynamicStack(5);

        dynamicStack.push(30);
        dynamicStack.push(20);
        dynamicStack.push(10);
        dynamicStack.push(90);
        dynamicStack.push(40);
        dynamicStack.push(50);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
    }
}
