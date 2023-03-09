package org.example;

public class Safe implements Lockable {
    @Override
    public void lock() {
    }
    Lockable safe = new Lockable() {
        @Override
        public void lock() {

        }
    };
}
