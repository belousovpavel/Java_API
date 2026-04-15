package com.example.lesson5;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class HomeWork5 {
    /**
     * Реализовать консольное приложение - телефонный справочник
     * Пользователь может вводить команды:
     * 1. ADD Ivanov 8800555 - добавить в справочник новое значение.
     * 2. GET Ivanov - Получить список всех номеров по фамилии
     * 3. Remove Ivanov- удалить все номера по фамилии
     * 4. List - Посмотреть все записи
     */
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите команду: ");
            String info = scanner.nextLine();
            String[] parts = info.split(" ");
            String command = parts[0].toLowerCase();
            // exit
            if(command.equals("exit")){
                System.exit(0);
            }
            //ADD
            else if(command.equals("add")){
                String lastname = parts[1];
                String number = parts[2];
                if(!phoneBook.containsKey(lastname)){
                    phoneBook.put(lastname, new ArrayList<>());
                }
                List<String> numbers = phoneBook.get(lastname);
                if(!numbers.contains(number)){
                    numbers.add(number);
                }
                else{
                    System.out.println("Такой номер уже существует для это фамилии");
                }
            }
            //get
            else if(command.equals("get")){
                String name = parts[1];
                List<String> numbers = phoneBook.get(name);
                if(numbers == null){
                    System.out.println("Для такой фамилии телефонов нет");
                }
                else{
                    for (int i = 0; i < numbers.size(); i++) {
                        System.out.println(numbers.get(i));
                    }
                }
            }
            //remove
            else if (command.equals("remove")){
                String name = parts[1];
                List<String> numbers = phoneBook.remove(name);
                if(numbers == null){
                    System.out.println("Для такой фамилии телефонов нет");
                }else{
                    System.out.println("Удалены номера для фамилии "+ name);
                }
            }
            //list
            else if (command.equals("list")){
                List<String> name = new ArrayList<>(phoneBook.keySet());
                Collections.sort(name);
                System.out.println("Все записи телефонного справочника");
                for(int i = 0; i < name.size(); i++){
                    String lastname = name.get(i);
                    List<String> numbers = phoneBook.get(lastname);
                    System.out.println(lastname);

                    for(int j = 0; j < numbers.size(); j++){
                        System.out.println(numbers.get(j));
                    }
                }
            }
        }
    }
}
