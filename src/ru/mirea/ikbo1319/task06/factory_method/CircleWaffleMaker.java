package ru.mirea.ikbo1319.task06.factory_method;

public class CircleWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new CircleWaffle();
    }
}
