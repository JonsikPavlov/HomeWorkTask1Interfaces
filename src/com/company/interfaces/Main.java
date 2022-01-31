package com.company.interfaces;

public class Main {
    /*  Создать в классе Main метод, который принимает интерфейс Breathing и выполняет все методы интерфейса.
     *  Вызвать его для объектов класса Person и Animal.*/

//    @Override
//    public void breath() {
//        System.out.println(getClass() + " is breathing");
//    }
//
//    @Override
//    public void holdBreath() {
//        System.out.println( getClass() + " is holding breath");
//    }
//
//    @Override
//    public void sneeze() {
//        Breathable.super.sneeze();
//    }

    public void interfaceBreathableAccomplish(Breathable breathable){
        breathable.breath();
        breathable.holdBreath();
        breathable.sneeze();
        }

    public static void main(String[] args) {
        Breathable person = new Person(" John", 93);
        person.breath();
        person.holdBreath();
        person.sneeze();
        System.out.println();
    }
    }

