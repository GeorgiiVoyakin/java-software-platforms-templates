package ru.mirea.ikbo1319.task06.factory_method;

public class RectangularWaffleMaker implements WaffleMaker {
    @Override
    public Waffle factoryMethod() {
        return new RectangularWaffle();
    }
}
