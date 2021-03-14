package ru.mirea.ikbo1319.task06.abstract_factory;

public class IceCreamFactoryA implements IceCreamFactory {
    @Override
    public IceCreamCone createIceCreamCone() {
        return new IceCreamConeA();
    }

    @Override
    public IceCreamSundae createIceCreamSundae() {
        return new IceCreamSundaeA();
    }
}
