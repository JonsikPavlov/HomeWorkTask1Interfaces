package com.company.interfaces;

public class Person implements Eatable, Breathable{
    /* Создать интерфейсы Eating с методом eat и Breathing с методами breathe и holdBreath,
     *  default методом sneeze. Создать классы Person и Animal, которые реализуют оба интерфейса.
     *  Каждый метод выводит свое название и класс, в котором находится.
     *  Создать в классе Main метод, который принимает интерфейс Breathing и выполняет все методы интерфейса.
     *  Вызвать его для объектов класса Person и Animal.*/
    private String name;
    private int weight;


    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println(getClass() + getName() +" is eating");
    }
    @Override
    public void breath() {
        System.out.println(getClass() + getName() +" is breathing");
    }

    @Override
    public void holdBreath() {
        System.out.println( getClass() + getName() + " is holding breath");
    }

    @Override
    public void sneeze() {
        Breathable.super.sneeze();
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(" Antony", 85);
        person.eat();
        person.breath();
        person.holdBreath();
        System.out.println(person.toString());
    }
}
