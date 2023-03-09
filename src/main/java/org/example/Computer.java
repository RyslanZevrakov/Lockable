package org.example;

public class Computer implements Lockable {
    @Override
    public void lock() {

    }
    Lockable computer = new Lockable() {
        @Override
        public void lock() {

        }
    };
}
