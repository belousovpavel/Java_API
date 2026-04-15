package com.example.lesson5;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        // Получить из текста слова, длиннее 5 символов
        String text = "Сегодня погода просто чудесная, солнышко светит так ярко, что хочется гулять весь день." +
                "Надеюсь, у тебя тоже выдался отличный день и ты успел насладиться этой красотой.";

        String[] wordsArray = text.split("[.,]{0,1}\\s++");
        List<String> words = Arrays.asList(wordsArray);

        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(word -> System.out.print(word + " ")); // терминальная операция

        System.out.println();

        words.stream()
                .filter("погода"::equals)
                .findAny()
                .ifPresentOrElse(word -> System.out.println("Слово найдено"), () -> System.out.println("Слово не найдено"));

        // Все слова, короче 6 символов, перевести в верхний регистр, развернуть и собрать в список
        List<String> modified = words.stream()
                .filter(word -> word.length() < 6)
                .map(String::toUpperCase)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(modified);


    }
}
