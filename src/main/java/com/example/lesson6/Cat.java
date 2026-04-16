package com.example.lesson6;

public class Cat {

    //private недоступны никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем


    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота(столько он съедает за раз)
    private boolean satiety; // сытость (голодный или нет)


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
//    public void setName(String name) {
//        this.name = name;
//    }

    public void eat(Plate plate){
        if (satiety){
            return;
        }
        satiety = plate.decreaseFood(appetite);
    }


    @Override
    public String toString() {
        return name + " " + appetite + " " + satiety;
    }
}
