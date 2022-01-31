package com.company.interfaces;

public class Animal implements Breathable, Eatable {
    /* Создать интерфейсы Eating с методом eat и Breathing с методами breathe и holdBreath,
     *  default методом sneeze. Создать классы Person и Animal, которые реализуют оба интерфейса.
     *  Каждый метод выводит свое название и класс, в котором находится.
     *  Создать в классе Main метод, который принимает интерфейс Breathing и выполняет все методы интерфейса.
     *  Вызвать его для объектов класса Person и Animal.*/
    private String type;
    private int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println(getClass() + getType() + " is breathing");
    }

    @Override
    public void holdBreath() {
        System.out.println(getClass() + getType() + " is holding breath");
    }

    @Override
    public void sneeze() {
        Breathable.super.sneeze();
    }

    @Override
    public void eat() {
        System.out.println(getClass() + getType() + " is eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Animal animal = new Animal(" Tiger", 7);
        animal.sneeze();
        animal.eat();
        animal.breath();
        animal.holdBreath();
        System.out.println(animal.toString());
    }
}
