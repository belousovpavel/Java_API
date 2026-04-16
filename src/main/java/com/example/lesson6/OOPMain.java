package com.example.lesson6;

public class OOPMain {
    public static void main(String[] args) {
        /**
         * Написать программу в которой будут коты(объекты) будут есть из тарелки (объект)
         */

        /**
         * Создать класс кота
         *
         */
        Cat murzik = new Cat("Murzik", 150);
//        cat.setName("new name");
        Cat gav = new Cat("Gav", 7);
//        cat.name = "Murzik";

        System.out.println(murzik.getName());
        System.out.println(gav.getName());

        System.out.println(murzik);

        Plate plate = new Plate(150);
        Plate defaultplate = new Plate();

        System.out.println(plate);
        System.out.println(defaultplate);

        // Заставить кота поесть из тарелки
        // Если еды в тарелке недостаточно, то кот просто не прикасается к ней
        murzik.eat(plate);
        gav.eat(plate);

        System.out.println(murzik);
        System.out.println(gav);
        System.out.println(plate);
    }
}
