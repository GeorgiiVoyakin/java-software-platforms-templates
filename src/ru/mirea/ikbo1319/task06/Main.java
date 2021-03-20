package ru.mirea.ikbo1319.task06;

import ru.mirea.ikbo1319.task06.abstract_factory.Client;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactory;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactoryA;
import ru.mirea.ikbo1319.task06.abstract_factory.IceCreamFactoryB;
import ru.mirea.ikbo1319.task06.builder.*;
import ru.mirea.ikbo1319.task06.factory_method.CircleWaffleMaker;
import ru.mirea.ikbo1319.task06.factory_method.RectangularWaffleMaker;
import ru.mirea.ikbo1319.task06.factory_method.Waffle;
import ru.mirea.ikbo1319.task06.factory_method.WaffleMaker;
import ru.mirea.ikbo1319.task06.prototype.Packing;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory method example: ");
        WaffleMaker[] waffleMakers = { new CircleWaffleMaker(), new RectangularWaffleMaker() };
        for (WaffleMaker waffleMaker : waffleMakers) {
            Waffle waffle = waffleMaker.factoryMethod();
            waffle.print();
        }
        System.out.println();

        System.out.println("Abstract factory example: ");
        IceCreamFactory[] iceCreamFactories = { new IceCreamFactoryA(), new IceCreamFactoryB() };
        for (IceCreamFactory iceCreamFactory : iceCreamFactories) {
            Client client = new Client(iceCreamFactory);
            client.execute();
        }
        System.out.println();

        System.out.println("Builder example: ");
        Builder[] builders = { new TeslaBuilder(), new ToyotaBuilder() };
        for (Builder builder : builders) {
            Director director = new Director(builder);
            director.Construct();
            Car car = builder.GetResult();
            car.print();
        }
        System.out.println();

        System.out.println("Prototype example: ");
        Packing originalPacking = new Packing();
        Packing[] packingArray = new Packing[5];
        for (int i = 0; i < 5; i++) {
            try {
                packingArray[i] = originalPacking.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            packingArray[0].print();
        }
        System.out.println();
    }
}
