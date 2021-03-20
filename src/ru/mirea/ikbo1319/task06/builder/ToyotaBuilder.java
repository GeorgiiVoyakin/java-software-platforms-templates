package ru.mirea.ikbo1319.task06.builder;

public class ToyotaBuilder implements Builder {
    Car car = new Car();

    @Override
    public void BuildEngine() {
        car.buildEngine("Gas engine");
    }

    @Override
    public void SetDirector() {
        car.setDirector("Toyota");
    }

    @Override
    public Car GetResult() {
        return car;
    }
}
