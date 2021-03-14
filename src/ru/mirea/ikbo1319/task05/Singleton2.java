package ru.mirea.ikbo1319.task05;

public class Singleton2 {
    private static Singleton2 INSTANCE = null;
    private Singleton2() {}

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
