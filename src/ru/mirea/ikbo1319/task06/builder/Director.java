package ru.mirea.ikbo1319.task06.builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Construct() {
        builder.BuildEngine();
        builder.SetDirector();
    }
}
