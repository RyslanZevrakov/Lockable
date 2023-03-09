package org.example;

public class Main {
    public static void main(String[] args) {


Lockable safa = () -> System.out.println("jj");
Lockable house = () -> System.out.println("дом");
Lockable computer = () -> System.out.println("ёжик");
Lockable cat = () -> System.out.println("мяу");
safa.lock();
house.lock();
computer.lock();
cat.lock();
    }
}