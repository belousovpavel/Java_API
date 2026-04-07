package com.example.lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean checkPolindrom = isPalindrome(word);
        System.out.println(checkPolindrom);
    }

    /**
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}
