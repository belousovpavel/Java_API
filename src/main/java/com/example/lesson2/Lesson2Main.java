package com.example.lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
//        stringPool();
        System.out.println(buildString(8,'1','2'));

        System.out.println(extractDomainName("manager@gb.com"));
        System.out.println(compress("aaaabbbcdd"));

        /**
         * Методы для строк
         */
        String s = "abcfurefhie";
        int length = s.length();//длина строки
        char c = s.charAt(2);// элемент по индексу строки
        String substring = s.substring(5);// подстрока, начиная с 5 символа
        String substring1 = s.substring(5, 7); //подстрока с 5 по 7 символ
        String lowerCase = s.toLowerCase();// перевоит строку в нижний регистр
        String upperCase = s.toUpperCase();// переводит строку в верхний регистр
        boolean startsWith = s.startsWith("abc"); // начинается ли строка с этого
        boolean endsWith = s.endsWith("def");
        String trim = s.trim();//обрезает пробелы

        String text = "I am java developer";
        String[] words = text.split(" ");//разбивает строку по пробелам

        byte[] bytes = s.getBytes();//массив байт из которых состоит строка


    }


    /**
     * Напишите метод, который сжимает строку. Пример:
     * aaaabbbcdd -> a4b3cd2
     */

    static String compress (String source){
        String result = "";
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i-1) == source.charAt(i)) {
                count++;
            }
            else {
                result += source.charAt(i-1);
                if (count >1){
                    result += count;
                }
                count = 1;
            }
        }
        result += source.charAt(source.length()-1);
        if (count >1){
            result += count;
        }
        return result;
    }


    /**
     * Дано: электронная почта и домен. Нужно найти доменное имя сотрудника.
     * manager@gb.com -> manager
     */

    static String extractDomainName(String mail) {
        //1. Нужно найти @
        //2. Взять часть строки до @
        int indexOfAt = mail.indexOf('@');
        return mail.substring(0, indexOfAt);
    }

    /**
     *  Дано четное число n b символы c1 c2. Нужно создать строку c1c2c1c2...c1c2 длины n.
     */
    static String buildString (int n, char c1, char c2){
        String temp = String.valueOf(c1) + String.valueOf(c2);
        //append.repeat простой способ
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
//            str += str;
            str.append(temp);
        }
        return str.toString();
    }




    private static void stringPool() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false

        System.out.println(s3.equals(s4)); //true
    }
}
