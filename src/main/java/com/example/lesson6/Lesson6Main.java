package com.example.lesson6;

import java.util.*;

public class Lesson6Main {
    public static void main(String[] args) {
        //collection <- Set, только уникальные элементы

        //  HashTable, keys от HashMap
        HashSet<String> hashSet = new HashSet<>(); // неважен порядок, только уникальные
        // keys от TreeMap
        // Красно-черное дерево
        TreeSet<String> treeSet = new TreeSet<>(); // порядок отсортированный
        // keys от LinkedHashMap
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(); //уникальные и важен порядок

        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        printUniqueElements(list);

//        treeSet.add();
//        treeSet.contains();
//        treeSet.first();

//        System.out.println(treeSet);

        for (String s : treeSet) {

        }
    }

    /**
     * Нужно распечатать в консоль уникальные элементы
     */
    static void printUniqueElements(List<String> elements){
//        elements.stream()
//                .distinct()
//                .forEach(System.out::println);

        HashSet<String> unique = new HashSet<>(elements); // самый простой
//        for (String element : elements) {
//            unique.add(element);
//        }
        System.out.println(unique);
    }

}
