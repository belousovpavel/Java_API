package com.example.lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordRememberApp {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя строку вида text~num
     *
     * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка.
     * 3. Если введено exit, то завершаем.
     *
     * java~4
     * python~2
     * print~4 -> java
     * print~2-> python
     * print~3 -> throw new NoSuchElementException
     *
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> storage = new LinkedList<>(); // new ArrayList<>();
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            }

            String[] arguments = command.split("~");
            if (arguments.length != 2) {
                System.err.println("Wrong number of arguments");
                continue;
            }

            // arguments.length == 2
            String word = arguments[0];
            int index;
            try {
                index = Integer.parseInt(arguments[1]);
            } catch (NumberFormatException e) {
                System.err.println("Второй аргумент команды не является числом");
                continue;
            }

            if (word.equals("print")) {
                // ИСПРАВЛЕНО: проверяем, существует ли элемент с таким индексом
                if (index >= storage.size()) {
                    throw new NoSuchElementException("Элемент с индексом " + index + " не существует");
                }
                String element = storage.remove(index);
                System.out.println(element);
                    } else {
                // ИСПРАВЛЕНО: заполняем null до нужного индекса
                while (storage.size() <= index) {
                    storage.add(null);
                }
                // ИСПРАВЛЕНО: добавляем на позицию index
                storage.set(index, word);
            }
            System.out.println("Storage is: " + storage);
        }
    }

}
