package org.example;

// Описать неизменяемый класс (Неизменяемость должна сохранятся при любых обстоятельствах)
public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Челси", "лабродор");

        myDog.sayInfo();
    }
}