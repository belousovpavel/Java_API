package com.example.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        helloWorld();

//        int[] array = {1,1,0,1,1,1};
//        int result = maxCounter(array);
//        System.out.println(result);

//        int[] nums = {3,2,2,3};
//        changeOrder(nums,3);
//        System.out.println(Arrays.toString(nums));
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));


    }

    /**
     * Дан массив, нужно его развернуть.
     */

    static void reverse(int[] array){
        //0<->size-1
        //1<-> size-2
        //i<->size-1-i
        int size = array.length;
        for (int i = 0; i < size/2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
    }

    /**
     * Дан массив nums = {3,2,2,3} и число val = 3
     * Если в массиве есть числа равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько элементов массив должен быть отличным от заданного, а остальные - равны ему.
     */

    static void changeOrder(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                for (int j = i; j < array.length-1; j++) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], найти максимальное количество подряд идущих 1.
     */

    static int maxCounter(int[] array){
        int res = 0;
        int max = 0;
        for (int i=0; i<array.length; i++)
            if (array[i] == 1) {
                res++;
                if (max < res) {
                    max = res;
                }
            } else {
                res = 0;
            }
        return max;
    }


    /**
     * Написать программу, которая запросит пользователя ввести Имя в консоли.
     * Получит введенную строку и выведет в консоль сообщение "Привет, Имя"
     */
    private static void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Привет, " + line);
    }
}