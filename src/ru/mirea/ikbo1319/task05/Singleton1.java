package ru.mirea.ikbo1319.task05;

public class Singleton1 {
    @SuppressWarnings("InstantiationOfUtilityClass")
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
