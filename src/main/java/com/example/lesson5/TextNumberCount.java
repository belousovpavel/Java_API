package com.example.lesson5;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TextNumberCount {

    /**
     * Задан текст, нужно посчитать популярности длин строк.
     */

    public static void main(String[] args) {

        String text = "Сегодня погода просто чудесная, солнышко светит так ярко, что хочется гулять весь день." +
                "Надеюсь, у тебя тоже выдался отличный день и ты успел насладиться этой красотой.";

        // 1-> у, и
        // 2-> ты
        // 3-> так, что


        String[] words = text.split("\\s++"); // один или больше пробелов

////        Способ со стримами
//        Map<Integer, List<String>> wordsGroupingBy = Arrays.stream(words)
//                .map(item -> item.replace(",", ""))
//                .map(item -> item.replace(".", ""))
//                .map(String::toLowerCase)
////                .map(item -> item.toLowerCase())
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(wordsGroupingBy);

        //Простой способ

        HashMap<Integer, List<String>> stats = new HashMap<>();
        for (String word : words) {
            // Отбросить знаки препинания
            String pureWord = word.replace(".", "")
                    .replace(",", "")
                    .toLowerCase();

            int  length = pureWord.length();
            if (!stats.containsKey(length)) {
                stats.put(length, new ArrayList<>(Arrays.asList(pureWord)));
            } else {
                List<String> otherWords = stats.get(length);
                otherWords.add(pureWord);
                stats.put(length, otherWords);// Необязательно
            }
        }
        System.out.println(stats);
    }
}
