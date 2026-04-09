package com.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Lesson3Main {
    public static void main(String[] args) {
//        intro();
//        timer();
//
//        ArrayList<String> strings= new ArrayList<>(Arrays.asList("a", "b","b","b","b","b","b", "c","a","b","d"));
//        removeDuplicates(strings);
//        System.out.println(strings);
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("str", "1", "-5", "abc", ""));
        cleanup(strings);
        System.out.println(strings);

    }

    /**
     * Дан массив, в котором некоторые строки являются целыми числами.
     * Нужно удалить все строки
     */

    private static void cleanup (ArrayList<String> strings){

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!isInteger(next)){
                iterator.remove();
            }
        }
        // Одно и тоже
        for (String next : strings) {

        }



        Pattern numberPattern = Pattern.compile("\\d+");
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer.parseInt(strings.get(i));
            } catch (NumberFormatException e){
                strings.remove(i);
                i--;
            }
        }
    }

    private static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }

    /**
     * Удалить из списка дубликаты
     */
    private static void removeDuplicates(ArrayList<String> strings){
        for(int i=0; i<strings.size(); i++){
            for(int j=i+1; j<strings.size(); j++){
                if(strings.get(i).equals(strings.get(j))){
                    strings.remove(j);
                    j--;
                }
            }
        }
    }

    private static void timer(){
        // Измерить время добавления 1_000_000 элементов в списке

        //Количество милисекунд, прошедших с 1 января 1970 года по UTC-0
        // Москва -> UTC +3
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        //код
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));

        ArrayList<Integer> list2 = new ArrayList<>(1000000);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        //код
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));


    }

    private static void intro() {
        ArrayList<Integer> list = new ArrayList<>();
        //<> generic, обобщение
        ArrayList<Integer> list2 = new ArrayList<>(20);
        list.add(0,5);
        System.out.println(list.size());

        Integer remove = list.remove(0);

//        list.set(0,-1);

        //size
        //add (element)
        //add(index, element)
        //remove (element), remove(index)
        //set(index, element)
        //clear
        // sort
    }
}
