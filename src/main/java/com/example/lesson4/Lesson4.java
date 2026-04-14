package com.example.lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson4 {

    public static void main(String[] args) {
//        lists();

//        stackAndQueue();



    }

    private static void stackAndQueue() {
        // Collection -> List Интерфейс, -> [ArrayList, LinkedList]
        // Collection -> Queue -> Deque-> [ArrayDeque, LinkedList]
        // Collection -> Set
        //Collection -> Map

        // Stack LIFO
        // Queue FIFO

        // push add
        //get pop remove

        // Stack
        // add 1 2 3 4 5
        // pop 5 4 3 2 1

        // Queue
        // add 1 2 3 4 5
        // pop 1 2 3 4 5

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        list.addLast();
//        list.addFirst();
        list.removeFirst();
        list.removeLast();

        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
    }

    private static void lists() {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.get(4);
        linkedList.get(4);
    }
}
