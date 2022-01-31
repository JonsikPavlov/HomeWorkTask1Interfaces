package com.company;

public class Fraction {
    /*    Создать класс Fraction, который представляет собой простую математическую дробь.
     *    Класс хранит 2 поля: numerator и denominator.
     *    Создать 2 конструктора:
     *   • Со всеми параметрами. Не забыть проверку знаменателя не равного нулю
     *   • Без параметров, который устанавливает значения в 1.
     *    Создать метод вывода на консоль дроби в виде например 1/2
     *            *) Создать статический метод принимающий 2 объекта Fraction и складывающий дроби,
     *    возвращая новый объект Fraction, хранящий результат */

    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        if (denominator == 0) {
            System.out.println("Change denominator, it can not be '0'.");
        }
    }

    public void fractionWithSlash() {
        if (this.denominator != 0) {
            System.out.println(this.numerator + "/" + this.denominator);
        }
        if (this.denominator == 0) {
            System.out.println("Change denominator, it can not be '0'.");
        }
    }

    public static Fraction fractionSum(Fraction newFraction1, Fraction newFraction2) {
        Fraction newFraction3 = new Fraction();
        int i = 1;
        while (i > 0) {
            if (i % newFraction1.denominator == 0 && i % newFraction2.denominator == 0) {
                newFraction1.numerator = (i / newFraction1.denominator) * newFraction1.numerator;
                newFraction1.denominator = i;
                newFraction2.numerator = (i / newFraction2.denominator) * newFraction2.numerator;
                newFraction2.denominator = i;
                break;
            } else {
                i++;
            }
        }
        newFraction3.numerator = newFraction1.numerator + newFraction2.numerator;
        newFraction3.denominator = newFraction1.denominator;
        newFraction3.fractionWithSlash();
        return newFraction3;
    }


    public static void main(String[] args) {

        Fraction fraction = new Fraction();
        fraction.fractionWithSlash();

        Fraction fraction1 = new Fraction(2, 5);
        fraction1.fractionWithSlash();

        Fraction fraction2 = new Fraction(2, 3);
//        fraction2.fractionWithSlash();
        fractionSum(fraction1,fraction2);
    }
}
