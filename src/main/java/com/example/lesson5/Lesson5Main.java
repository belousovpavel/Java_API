package com.example.lesson5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson5Main {

    public static void main(String[] args) {
        hashMap();
//        introHashMap();

        System.out.println(isIsomorph("add","egg"));
        System.out.println(isIsomorph("note","code"));
        System.out.println(isIsomorph("foo","bar"));
    }

    private static void hashMap() {
        //introHashMap();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("string", 6);
        map.put("java", 4);
        map.put("python",6);
        System.out.println(map);

        // buckets, 16 = [null, null, ..., null]
        map.put("python", 5);
        // key -> hash = hash(key) - int
        // hash -> bucket
        // if hash = 7 -> [null, null, ..., key, ..., null] bucket = 7
        // if hash = 18 bucket = 18 % 16 -> bucket = 2
        // В нужный бакет добавляется пара <key, value>

        map.put("java", 4);
        // key -> hash = hash(key) - int
        // Если бакет уже занят
        // Проверяем ключи по equals
        // Если ключи равны по equals то заменяем
        // Если не равны, то внутрь корзинки помещается список пар <key, value>

        //[null, null, [java=4, python=6], null, ..., null]

        map.get("java");
    }

    private static void introHashMap() {
        // List, Queue, Deque -> Collection
        //Map <String, String>  - хранилище типа ключ-значение

        // Интерфейс - задает поведение, то что умеет делать список






        HashMap<String,String> hashMap= new HashMap<>();

        // Добавление пары ключ-значение
        hashMap.put("key","value");

        // Получение значения по ключу
        String valueByKey = hashMap.get("key");
        System.out.println(valueByKey);

        // Проверка наличия ключа
        boolean containsKey = hashMap.containsKey("key");
        System.out.println(containsKey);

        //получение множества всех ключей
        Set<String> keySet = hashMap.keySet();
        //Получение всех значений
        Collection<String> values = hashMap.values();

        // Удаление пары по ключу
        hashMap.remove("key");

        // Получение списка всех пар
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();

        // Удалить все пары
        hashMap.clear();
    }


    /**
     *Даны 2 строки, написать код, который вернет true,
     * если эти строки являются изоморфными и false, если нет
     * Строки изоморфны, если одну буквы в первом слове можно заменить на некоторую букву во втором слове
     */
    private static boolean isIsomorph(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        for (int i = 0; i < firstChars.length; i++) {
            if(!map.containsKey(firstChars[i])) {
                map.put(firstChars[i], secondChars[i]);
            }else {
                if(map.get(firstChars[i]) != secondChars[i]) {
                    return false;
                }
            }
        }
        return true;
    }



}
