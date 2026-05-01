package org.example;

public class Squirrel <T> {
    private T name;

    Squirrel(T name) {
        this.name = name;
    }

    T getName() {
        return this.name;
    }
}
