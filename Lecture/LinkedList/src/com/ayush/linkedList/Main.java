package com.ayush.linkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(99);
//        list.insert(100, 4);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        DoublyLinkedList list = new DoublyLinkedList();
//
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(99);
//        list.insert(2, 55);
//
//        list.display();

        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.delete(3);
        list.display();
    }
}
