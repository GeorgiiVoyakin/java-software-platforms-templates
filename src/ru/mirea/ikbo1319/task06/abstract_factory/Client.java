package ru.mirea.ikbo1319.task06.abstract_factory;

public class Client {
    private final IceCreamCone iceCreamCone;
    private final IceCreamSundae iceCreamSundae;

    public Client(IceCreamFactory factory) {
        iceCreamCone = factory.createIceCreamCone();
        iceCreamSundae = factory.createIceCreamSundae();
    }

    public void execute() {
        iceCreamCone.print();
        iceCreamSundae.print();
    }
}
