package com.example.lesson4;

import java.util.*;

public class HomeWork4 {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и "запоминает" строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается.
     *
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python,java]
     * > revert -> [python,java]
     * > print -> []
     * < [java, python]
     * >revert
     * >revert
     * >print
     * <[]
     * > revert -> throw new NoSuchElementException
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> commands = new ArrayList<>();
        while (true){
            String word = scanner.nextLine();
            if (word.equals("exit")){
                System.exit(0);
            }
            else if (word.equals("revert")){
                if (commands.isEmpty()) {
                    throw new NoSuchElementException("Нет элементов для удаления");
                }
                commands.remove(commands.size() - 1);
            }
            else if (word.equals("print")){
                List<String> reversed = new ArrayList<>(commands);
                Collections.reverse(reversed);
                System.out.println(reversed);
            }
            else{
                commands.add(word);
            }
        }
    }
}
