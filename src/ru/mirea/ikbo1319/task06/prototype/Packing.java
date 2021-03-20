package ru.mirea.ikbo1319.task06.prototype;

public class Packing implements Cloneable {
    public void print() {
        System.out.println("New packing");
    }

    @Override
    public Packing clone() throws CloneNotSupportedException {
        return (Packing) super.clone();
    }
}
